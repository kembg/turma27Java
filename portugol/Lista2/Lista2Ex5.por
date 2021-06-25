programa
{
	
	funcao inicio()
	{

//A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente 
//poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25.
//Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades,
//se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades,
//se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
//Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
//--------------------------------------------------------------------------------------------------------------------------------
           
            
            real poluicao
            const real POLUICAO_MAX = 0.5
            const real POLUICAO_1_E_2 = 0.4
            const real POLUICAO_1 = 0.3
            const real POLUICAO_ACEITAVEL = 0.29
            
            escreva("Qual o indice de poluição? ")
            leia(poluicao)

            se(poluicao >= POLUICAO_MAX){
            	//para todos os grupos 
            	escreva("Interrompam atividades!")
            	
            } senao se (poluicao>= POLUICAO_1_E_2){

            	escreva("Empresas do 1° e 2° grupo : Interroompa atividades!")
            	
            } senao se (poluicao>=POLUICAO_1){

            	escreva ("Empresas do 1° grupo : Interrompam as atividades!")
            } senao {
            	
            	escreva("Indice de poluição igual ou menor que aceitavel : ", POLUICAO_ACEITAVEL) 
            }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 794; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */