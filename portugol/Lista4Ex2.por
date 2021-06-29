programa
{
	inclua biblioteca Sons
/*2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, 
 escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas
 foram as ocorrências da maior pontuação.*/
	
	funcao inicio()
	{
		inteiro valorDado[10], maiorValor=0, quantidadeMaior=0, mediaValor=0, somaValores=0

		para(inteiro i=0; i<10; i++)
		{
			escreva("\nDigite qual o valor do dado nesse lançamento : ")
			leia(valorDado[i])
			somaValores+=valorDado[i]
			mediaValor=somaValores/10
	
			se ( valorDado[i]>maiorValor){
				maiorValor=valorDado[i]
			} 
		}
		para(inteiro i=0; i<10; i++)
		{
			se (maiorValor == valorDado[i]){
				quantidadeMaior++
			}
		}
		
		limpa()
		escreva ("\nO valor média dos lançamentos é : ", mediaValor)
		escreva("\nO maior valor foi : ", maiorValor, " e foi obtido : " , (quantidadeMaior)," vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 724; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */