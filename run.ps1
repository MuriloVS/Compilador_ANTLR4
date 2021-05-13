# test-01-constant-expressions  test-02-left-associativity
# test-03-variables             test-04-multiple-print
# test-05-read                  test-06-stack-size
# test-07-sequential-if         test-08-chained-if
# test-09-sequential-while      test-10-chained-while
# test-11-break-continue        test-12-chained-conditionals
# test-13-strings               test-14-array
# test-15-simple-functions      test-16-parameters

# error-01-undefined-variables  error-02-unused-variables
# error-03-break-continue       error-04-type-checking
# error-05-array-checking       error-06-simple-functions
# error-07-parameters

# nome do arquivo testado deve ser mudado aqui
Get-Content test-16-parameters.exp | .\Compiler  > Test.j -encoding utf8

if ( $? ) {     
    java -jar  jasmin-2.4.jar Test.j

    if ( $? ) {           
        java Test
        
        if ( $? ) {
            Write-Output "`nRun sucessfull.`n"
        }
        else {
            Remove-Item Test.class 
        }
    }
}
else {   
    # mensagem de erro deve aparecer aqui se implementado corretamente - testar os exemplos 
    # Remove-Item Test.j
}    
