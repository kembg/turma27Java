programa
{
/*4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, e
  a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{
		inteiro matrizQuad[3][3], diagonal = 0, somatorio = 0, l, c

		para( l=0; l<3; l++)
		{
			para(c=0; c<3; c++)
			{
				escreva("Digite o valor do número na linha ", l, " coluna ", c," da matriz : ")
				leia(matrizQuad[l][c])

				somatorio+= matrizQuad[l][c]

				se (matrizQuad[l][l] == matrizQuad[c][c])
				{
					diagonal+=matrizQuad[l][l]
				}
			}
		}
		escreva("A soma da diagonal é : ", diagonal)
		
      }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 558; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */