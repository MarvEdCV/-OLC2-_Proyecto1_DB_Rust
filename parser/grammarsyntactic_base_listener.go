// Code generated from GrammarSyntactic.g4 by ANTLR 4.7.2. DO NOT EDIT.

package parser // GrammarSyntactic

import "github.com/antlr/antlr4/runtime/Go/antlr"

// BaseGrammarSyntacticListener is a complete listener for a parse tree produced by GrammarSyntactic.
type BaseGrammarSyntacticListener struct{}

var _ GrammarSyntacticListener = &BaseGrammarSyntacticListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseGrammarSyntacticListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseGrammarSyntacticListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseGrammarSyntacticListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseGrammarSyntacticListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterStart is called when production start is entered.
func (s *BaseGrammarSyntacticListener) EnterStart(ctx *StartContext) {}

// ExitStart is called when production start is exited.
func (s *BaseGrammarSyntacticListener) ExitStart(ctx *StartContext) {}

// EnterInstrucciones is called when production instrucciones is entered.
func (s *BaseGrammarSyntacticListener) EnterInstrucciones(ctx *InstruccionesContext) {}

// ExitInstrucciones is called when production instrucciones is exited.
func (s *BaseGrammarSyntacticListener) ExitInstrucciones(ctx *InstruccionesContext) {}

// EnterInstruccion is called when production instruccion is entered.
func (s *BaseGrammarSyntacticListener) EnterInstruccion(ctx *InstruccionContext) {}

// ExitInstruccion is called when production instruccion is exited.
func (s *BaseGrammarSyntacticListener) ExitInstruccion(ctx *InstruccionContext) {}

// EnterArray_st is called when production array_st is entered.
func (s *BaseGrammarSyntacticListener) EnterArray_st(ctx *Array_stContext) {}

// ExitArray_st is called when production array_st is exited.
func (s *BaseGrammarSyntacticListener) ExitArray_st(ctx *Array_stContext) {}

// EnterExpression is called when production expression is entered.
func (s *BaseGrammarSyntacticListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseGrammarSyntacticListener) ExitExpression(ctx *ExpressionContext) {}

// EnterExpr_arit is called when production expr_arit is entered.
func (s *BaseGrammarSyntacticListener) EnterExpr_arit(ctx *Expr_aritContext) {}

// ExitExpr_arit is called when production expr_arit is exited.
func (s *BaseGrammarSyntacticListener) ExitExpr_arit(ctx *Expr_aritContext) {}

// EnterListValues is called when production listValues is entered.
func (s *BaseGrammarSyntacticListener) EnterListValues(ctx *ListValuesContext) {}

// ExitListValues is called when production listValues is exited.
func (s *BaseGrammarSyntacticListener) ExitListValues(ctx *ListValuesContext) {}

// EnterPrimitivo is called when production primitivo is entered.
func (s *BaseGrammarSyntacticListener) EnterPrimitivo(ctx *PrimitivoContext) {}

// ExitPrimitivo is called when production primitivo is exited.
func (s *BaseGrammarSyntacticListener) ExitPrimitivo(ctx *PrimitivoContext) {}

// EnterListArray is called when production listArray is entered.
func (s *BaseGrammarSyntacticListener) EnterListArray(ctx *ListArrayContext) {}

// ExitListArray is called when production listArray is exited.
func (s *BaseGrammarSyntacticListener) ExitListArray(ctx *ListArrayContext) {}
