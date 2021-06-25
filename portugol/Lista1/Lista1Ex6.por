programa
{
/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
 * escreva a distância entre eles. A fórmula é d= √(x2-x1)^2+(y2-y1)^2 que efetua tal cálculo é : */	
 
 inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1,y1,x2,y2,d

		escreva("Digite o valor de x1 : ")
		leia (x1)
		escreva("Digite o valor de x2 : ")
		leia (x2)
		escreva("Digite o valor de y1 : ")
		leia (y1)
		escreva("Digite o valor de y2 : ")
		leia (y2)

		d = mat.raiz((mat.potencia((x2-x1),2)) + (mat.potencia((y2-y1), 2)), 2)

		escreva(" A distância é igual a : ", mat.arredondar(d, 0))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */