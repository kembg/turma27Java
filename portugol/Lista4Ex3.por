programa
{
	inclua biblioteca Matematica
/*3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6], l, c

		para(c=0; c<6; c++)
		{
			para (l=0; l<4;l++){

				escreva ("Digite o valor do número na linha ", l, " coluna ", c," da matriz N1 : ")
				leia(N1[l][c])
			}
		} 
		para(c=0; c<6; c++)
		{
			para (l=0; l<4;l++){

				escreva ("Digite o valor do número na linha ", l, " coluna ", c," da matriz N2 : ")
				leia(N2[l][c])
			}
		}
		escreva ("\nMatriz com a soma de N1 e N2 (M1) : \n")
		para(c=0; c<6; c++)
		{
			para (l=0; l<4;l++){

				M1[l][c]=N1[l][c]+N2[l][c]
				escreva(M1[l][c],"\t")
				
			}
			escreva("\n")
		} 
		escreva("\nMatriz com a diferença de N1 e N2 (M2) : \n")
		para(c=0; c<6; c++)
		{
			para (l=0; l<4;l++){

				M2[l][c]=N1[l][c]-N2[l][c]
				escreva(M2[l][c], "\t")
			
			}
			escreva("\n")
		}              
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 993; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */