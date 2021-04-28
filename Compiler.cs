using System;
using System.Text;
using Antlr4.Runtime;

public class Compiler {
    public static void Main() {
        string input;
        StringBuilder text = new StringBuilder();
        while ((input = Console.ReadLine()) != null) {
            text.AppendLine(input);
        }

        AntlrInputStream inputStream = new AntlrInputStream(text.ToString());
        ExpLexer lexer = new ExpLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        ExpParser parser = new ExpParser(commonTokenStream);

        parser.program();
    }
}

