java -jar antlr-4.9.1-complete.jar -Dlanguage=CSharp -no-listener Exp.g4

if ( $? ) {    

    csc -r:Antlr4.Runtime.Standard.dll Compiler.cs ExpParser.cs ExpLexer.cs

    if ( $? ) {
        Write-Output "Build sucessfull.`n"       
    }
    else {        
        Write-Output "`nFailed to build .cs files.`n"
    }
}
else {    
    Write-Output "`nFailed to build Exp.g4.`n"
    
    Remove-Item Exp*.cs
    Remove-Item Exp*.class
    Remove-Item Exp*.tokens
}