programa
{
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/ 

	
	funcao inicio()
	{
		inteiro ano, meses, dias, diasTotal
		
		escreva ("Quantos anos você tem? ")
		leia (ano)

		escreva ("Legal! Você tem ", ano, " anos e quantos meses? ")
		leia (meses)

		escreva ("Uh ", ano, " anos e ", meses," meses. Agora só falta os dias: ")
		leia (dias)

		diasTotal = (ano*365)+(meses*30)+dias

		escreva ("Você tem ", diasTotal," de vida")
	
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */