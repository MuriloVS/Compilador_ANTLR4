#!/bin/bash

if java -jar antlr-4.9.1-complete.jar -Dlanguage=CSharp -no-listener Exp.g4; then
    csc -r:Antlr4.Runtime.Standard.dll Compiler.cs ExpParser.cs ExpLexer.cs
else
    rm -f Exp*.cs Exp*.class Exp.tokens
fi

