programa
{
	
	funcao inicio()
	{
		inteiro ano, meses, dias, diasTotal
		
		escreva ("Quantos dias de vida você tem? ")
		leia (diasTotal)
          
          ano = diasTotal/365
          meses = diasTotal%12
          dias = meses%30

		escreva ("Você tem ", ano," anos ", meses, " meses e ", dias, " dias de vida."  )
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 241; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */