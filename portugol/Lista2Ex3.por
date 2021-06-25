programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
//Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados.
//--------------------------------------------------------------------------------------------------------------------------------

 
          real num1, num2, num3, quad1, quad2, quad3 

          escreva("Qual o primeiro número? ")
          leia (num1)
          escreva("Qual o segundo número? ")
          leia (num2)
          escreva("Qual o terceiro número? ")
          leia(num3)

          quad1= mat.potencia(num1, 2)
          quad2= mat.potencia(num2, 2)
          quad3= mat.potencia(num3, 2)

          se (quad3>=1000){

          	escreva("O resultado é: ", quad3)
          } senao  {

          	escreva( "O quadrado do número ", num1, " é : ", quad1, ".\n")
          	escreva( "O quadrado do número ", num2, " é : ", quad2, ".\n")
          	escreva( "O quadrado do número ", num3, " é : ", quad1, ".\n")
          }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */