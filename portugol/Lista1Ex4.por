programa
{
/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
 * D=(R+S/2), onde R=(A+B)^2 e S=(B=C)^2  */	
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
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */