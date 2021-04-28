$files = Get-ChildItem *.exp

ForEach ($file in $files) { 
    # Write-Output $file   
    Get-Content $file | .\Compiler  > Test.j -encoding utf8

    if ( $? ) {     
        java -jar  jasmin-2.4.jar Test.j

        if ( $? ) {           
            java Test
            
            if ( $? ) {
                Write-Output "`nRun sucessfull.`n"
            } else {
                Remove-Item Test.class 
            }
        }
    } else {   
        # mensagem de erro deve aparecer aqui se implementado corretamente - testar os exemplos 
        Remove-Item Test.j
    }    
}