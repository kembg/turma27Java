programa
{
/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a 
 média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver 
 fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.	*/
	funcao inicio()
	{
		inteiro somatorio= 0, valorPositivo, quantosValores = 0
		real mediaValores

		escreva("Digite um valor positivo : ")
		leia(valorPositivo)

		enquanto( valorPositivo >= 0){
			somatorio+=valorPositivo
			quantosValores+=1
			escreva("Digite um valor positivo : ")
		     leia(valorPositivo)
		} se (valorPositivo < 0){
			escreva("Valor inválido. Fim do programa\n")
			escreva("A somatorio dos valores é : ", somatorio, ".\n")
			mediaValores = (somatorio/quantosValores)
			escreva("a media dos valores é : ", mediaValores, ".\n")
			escreva("Total de valores lidos : ", quantosValores, ".\n") 
		} 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */