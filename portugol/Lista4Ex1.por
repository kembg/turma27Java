programa
{
/*1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
 Encontre após a maior pontuação e a apresente. */
	funcao inicio()
	{
		inteiro notas [5], maiorNota = 0
		

		para (inteiro i=0; i<5;i++){
			
			escreva("\nDigite a pontuação : ")
			leia(notas[i])
			
		} para (inteiro i=0; i<5;i++) {

			escreva("\n A pontuação é : ", notas[i])

			se (notas[i]>maiorNota){
				maiorNota=notas[i]
			}
		}  	
		
		escreva("\n A maior pontuação é : ", maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */