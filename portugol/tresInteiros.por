programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a, b, c, d, r, s

		escreva("Dgite o primeiro numero : ")
		leia(a)
		escreva("Digite o segunfo numero : ")
		leia(b)
		escreva("Digite o terceito numero ; ")
		leia(c)
		
		r = mat.potencia((a+b), 2)
		s = mat.potencia((b+c), 2)
		d = (r + s)/2

		escreva("O valor de D é : ", d)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 149; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */