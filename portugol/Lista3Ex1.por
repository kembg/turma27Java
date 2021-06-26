programa
{
/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.
*/	
	funcao inicio()
	{
		real filhos, habitantes, totalFilhos = 0.00
		real mediaSalario = 0.00, porcentualSalario=0.00, maiorSalario =0.00, salario, salarioTotal = 0.00, abaixoDeCem = 0.00, mediaFilhos = 0.00

		para(habitantes=1.00; habitantes <=20; habitantes++){
			escreva("Quantos filhos tem o habitante ?")
			leia(filhos)
			escreva("Qual o salário do habitante?")
			leia(salario)
			salarioTotal=+salario

			se (salario>maiorSalario){
				maiorSalario = salario
			} 
			se (salario<=100.00){
				abaixoDeCem++
				se (habitantes == 20){
					porcentualSalario = (abaixoDeCem*100)/habitantes
				}
			}
			se (habitantes<=20){
				 totalFilhos+=filhos
				se (habitantes==20){
					mediaFilhos = totalFilhos/habitantes
					mediaSalario = salarioTotal/habitantes
				}
			}
			
		} 
		     limpa()
			escreva("A média do salário da população : ", mediaSalario)
			escreva("\nA média do número de filhos : ", mediaFilhos)
			escreva("\nO maior salário : ", maiorSalario)
			escreva("\nO percentual de pessoas com salário até R$100,00 : ", porcentualSalario)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 900; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */