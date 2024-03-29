parser grammar GrammarSyntactic;

options {
  tokenVocab = GrammarLexer;
}

@header {
    import "OLC2/interfaces"
    import "OLC2/expresion"
    import "OLC2/instruction"
    import arrayList "github.com/colegno/arraylist"
}

start returns [*arrayList.List lista]
  : instrucciones {$lista = $instrucciones.l}
;

instrucciones returns [*arrayList.List l]
  @init{
    $l =  arrayList.New()
  }
  : e +=instruccion*  {
      listInt := localctx.(*InstruccionesContext).GetE()
      		for _, e := range listInt {
            $l.Add(e.GetInstr())
          }
    }
;


instruccion returns [interfaces.Instruction instr]
  : CONSOLE '.' LOG PARIZQ expression PARDER ';' {$instr = instruction.NewImprimir($expression.p)}
  | P_NUMBER isArray=array_st id=ID '=' expression ';'{$instr = instruction.NewDeclaration($id.text,interfaces.INTEGER,$expression.p, $isArray.arr)}
  | id=ID '=' expression ';'{$instr = instruction.NewAssignment($id.text,$expression.p)}
  | P_IF PARIZQ expression PARDER LLAVEIZQ instrucciones LLAVEDER  {$instr = instruction.NewIf($expression.p, $instrucciones.l)}
  | P_WHILE PARIZQ expression PARDER LLAVEIZQ instrucciones LLAVEDER  {$instr = instruction.NewWhile($expression.p, $instrucciones.l)}
;

array_st returns [bool arr]
   : CORIZQ CORDER { $arr = true }
   |
;

expression returns[interfaces.Expresion p]
    : expr_arit    {$p = $expr_arit.p}
;

expr_arit returns[interfaces.Expresion p]
    : opIz = expr_arit op=('*'|'/') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false)}
    | opIz = expr_arit op=('+'|'-') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false)}     
    | opIz = expr_arit op=('<'|'<='|'>='|'>') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false)}     
    | CORIZQ listValues CORDER { $p = expresion.NewArray($listValues.l) }
    | primitivo {$p = $primitivo.p} 
    | PARIZQ expression PARDER {$p = $expression.p}
;

listValues returns[*arrayList.List l]
    : list=listValues ',' expression { 
                                        $list.l.Add($expression.p)
                                        $l = $list.l
                                    }
    | expression { 
                    $l = arrayList.New()
                    $l.Add($expression.p)
                }
;

primitivo returns[interfaces.Expresion p]
    :NUMBER {
            	num,err := strconv.Atoi($NUMBER.text)
                if err!= nil{
                    fmt.Println(err)
                }
            $p = expresion.NewPrimitivo (num,interfaces.INTEGER)
       } 
    | STRING { 
      str:= $STRING.text[1:len($STRING.text)-1]
      $p = expresion.NewPrimitivo(str,interfaces.STRING)}
    | list=listArray { $p = $list.p}
;

listArray returns[interfaces.Expresion p]
    : list = listArray CORIZQ expression CORDER { $p = expresion.NewArrayAccess($list.p, $expression.p) }
    | ID { $p = expresion.NewCallVariable($ID.text)}
    ;