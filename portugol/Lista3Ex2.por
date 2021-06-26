programa
{
/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares que 
 * são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500. */
	
	funcao inicio()
	{
		inteiro somatorioDeMult3 = 0
		const inteiro LIMITECONJUNTO = 500

		para (inteiro inicioConjunto = 1; inicioConjunto <= LIMITECONJUNTO; inicioConjunto++){
			se(inicioConjunto%2==1 e inicioConjunto%3==0){
				somatorioDeMult3 += inicioConjunto
			} 
	
	   } 
	   
	   escreva("A soma de todos os números ímpares que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500 : ", somatorioDeMult3)
		
	}   
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */