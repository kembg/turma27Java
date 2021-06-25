programa
{
/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e 
 * dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
  escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. */ 
	
	funcao inicio()
	{
		real impostos, distribuidor, custoCliente, custoFabrica
		
		escreva("Digite o custo de fabrica do carro em reais : ")
		leia(custoFabrica)
		
		impostos = custoFabrica*0.45
		distribuidor = custoFabrica*0.28
		custoCliente = custoFabrica + distribuidor + impostos

		escreva("O valor do carro é : ", custoCliente, " reais")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */