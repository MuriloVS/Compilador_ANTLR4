java -jar antlr-4.9.1-complete.jar -Dlanguage=CSharp -no-listener Exp.g4
csc -r:Antlr4.Runtime.Standard.dll Compiler.cs ExpParser.cs ExpLexer.cs
type error-02-unused-variables.exp | .\Compiler  > Test.j -encoding utf8