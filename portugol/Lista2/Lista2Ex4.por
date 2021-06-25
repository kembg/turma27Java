programa
{
	
	funcao inicio()
	{

//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
//e se é positivo ou negativo.
//--------------------------------------------------------------------------------------------------------------------------------

		inteiro num

		escreva("Digite um número : ")
		leia(num)

		limpa()

		se (num%2==0){

			escreva(num, " é par! \n")	
				
		} senao {
			
			escreva(num, " é ímpar! \n")
		}

		se (num>=0){

			escreva(num, " é positivo!")
		} senao {

			escreva(num, " é negativo!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */