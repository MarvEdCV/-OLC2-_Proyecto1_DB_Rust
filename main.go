package main

import (
	"OLC2/environment"
	"OLC2/interfaces"
	"OLC2/parser"

	"image/color"
	"log"

	"os"

	"gioui.org/app"
	"gioui.org/font/gofont"
	"gioui.org/io/system"
	"gioui.org/layout"
	"gioui.org/op"
	"gioui.org/text"
	"gioui.org/widget/material"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

type TreeShapeListener struct {
	*parser.BaseGrammarSyntacticListener
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitStart(ctx *parser.StartContext) {
	result := ctx.GetLista()

	var globalEnv environment.Environment
	globalEnv = environment.NewEnvironment(nil)

	for _, s := range result.ToArray() {
		s.(interfaces.Instruction).Ejecutar(globalEnv)
	}

}

func main() {
	// Setup the input
	//is := antlr.NewInputStream("\"El resultado es: \" + (10+5+5+5+5+5)")

	is, _ := antlr.NewFileStream("entrada.txt")
	// Create the Lexer
	lexer := parser.NewGrammarLexer(is)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

	// Create the Parser
	p := parser.NewGrammarSyntactic(stream)

	p.BuildParseTrees = true
	tree := p.Start()

	antlr.ParseTreeWalkerDefault.Walk(NewTreeShapeListener(), tree)

	go func() {
		w := app.NewWindow()
		err := run(w)
		if err != nil {
			log.Fatal(err)
		}
		os.Exit(0)
	}()
	app.Main()

}
func run(w *app.Window) error {
	th := material.NewTheme(gofont.Collection())
	var ops op.Ops
	for {
		e := <-w.Events()
		switch e := e.(type) {
		case system.DestroyEvent:
			return e.Err
		case system.FrameEvent:
			gtx := layout.NewContext(&ops, e)
			title := material.H1(th, "mi novia es bonita, ahuevoooo")
			maroon := color.NRGBA{R: 127, G: 0, B: 0, A: 255}
			title.Color = maroon
			title.Alignment = text.Middle
			title.Layout(gtx)

			e.Frame(gtx.Ops)
		}
	}
}
