programa
{
	
	funcao inicio()
	{
		cadeia time1, time2, time3, time4
		caracter resultado 
		inteiro pontos1=0, pontos2=0, pontos3=0, pontos4=0, vencedor=0

		escreva("Qual são os 4 times participantes do campeonato ?")
		leia(time1)
		leia(time2)
		leia(time3)
		leia(time4)
	
		
		
		para (inteiro i = 1; i <= 4; i++){
			escreva("\nRODADA "+i+"\n")
			
			escreva("O ", time1," perdeu(P), ganhou(G) ou empatou(E)? \n")
			leia(resultado)

			se(resultado == 'G' ou resultado == 'g'){
				pontos1 += 3
			} senao se (resultado == 'E' ou resultado == 'e'){
				pontos1 += 1
			} senao se (resultado == 'P' ou resultado == 'p'){
				pontos1 += 0
			} senao {
				escreva("Inválido")
			}

			escreva("O ", time2," perdeu(P), ganhou(G) ou empatou(E)? \n")
			leia(resultado)

			se(resultado == 'G' ou resultado == 'g'){
				pontos2 += 3
			} senao se (resultado == 'E' ou resultado == 'e'){
				pontos2 += 1
			} senao se (resultado == 'P' ou resultado == 'p'){
				pontos2 += 0
			} senao {
				escreva("Inválido")
			}

			escreva("O ", time3," perdeu(P), ganhou(G) ou empatou(E)? \n")
			leia(resultado)

			se(resultado == 'G' ou resultado == 'g'){
				pontos3 += 3
			} senao se (resultado == 'E' ou resultado == 'e'){
				pontos3 += 1
			} senao se (resultado == 'P' ou resultado == 'p'){
				pontos3 += 0
			} senao {
				escreva("Inválido")
			}

			escreva("O ", time4," perdeu(P), ganhou(G) ou empatou(E)? \n")
			leia(resultado)

			se(resultado == 'G' ou resultado == 'g'){
				pontos4 += 3
			} senao se (resultado == 'E' ou resultado == 'e'){
				pontos4 += 1
			} senao se (resultado == 'P' ou resultado == 'p'){
				pontos4 += 0
			} senao {
				escreva("Inválido")
			}	
			
			escreva ("PONTUAÇÃO DA RODADA : \n" )
			escreva (time1, " tem ", pontos1, "pontos\n")
			escreva (time2, " tem ", pontos2, "pontos\n")
			escreva (time3, " tem ", pontos3, "pontos\n")
			escreva (time4, " tem ", pontos4, "pontos\n")
			escreva ("-----------------------------------------------")
			}

		escreva("\nPONTOS FINAIS:")
		escreva("\nO total de pontos do ", time1," é: ", pontos1)
		escreva("\nO total de pontos do ", time2," é: ", pontos2)
		escreva("\nO total de pontos do ", time3," é: ", pontos3)
		escreva("\nO total de pontos do ", time4," é: ", pontos4)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */