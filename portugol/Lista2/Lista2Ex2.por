programa
{
	
	funcao inicio()
	{

//Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário.
//E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
//Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável.
//A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
//--------------------------------------------------------------------------------------------------------------------------------

		inteiro N, horasEx
		cadeia C
		real SalarioT = 0.00, SalarioE = 0.00

		escreva ("Qual o código do funcionário? ")
		leia(C)
		escreva("Quantas horas de trabalho? ")
		leia(N)

		limpa()

		escreva("Funcionário : ", C,".\n")

		se(N<50){
			SalarioT = N * 10.00 
			escreva (" Salário total : ", SalarioT)
			escreva ("Salário excendente : ", SalarioE, ".Bom trabalho!" )
		} senao {
			horasEx= N - 50
			SalarioE = (20.00 * horasEx)
			SalarioT = (50 * 10.00) + SalarioE 
			
			escreva ("Salário total : ", SalarioT, ".\n","Salário excendente : ", SalarioE, ". Ótimo trabalho!" )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 39; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */