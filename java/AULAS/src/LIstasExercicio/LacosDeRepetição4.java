package LIstasExercicio;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
public class LacosDeRepetição4 {

	public static void main(String[] args) {
		int idade, sexo, humor, habitantes=0;
		int quantMulheresNervosas=0, quantPessoasCalmas=0, quantHomensAgressivos=0;
		int quantiOutrosCalmos=0, quantiNervososMaisde40Anos=0, quantiCalmasMenosDe18Anos=0;
		
		Scanner leia = new Scanner(System.in);
		
		while (habitantes <=150) {
			System.out.println("Qual a idade do habitante ? ");
			idade = leia.nextInt();
			System.out.println("Qual o sexo do habitante ? (1-feminino 2- masculino 3-outros) ");
			sexo = leia.nextInt();
			System.out.println("Qual oo humor do habitantes ? (1- calmo 2-nervoso 3-agressivo) ");
			humor = leia.nextInt();
			if (humor == 1) {
				quantPessoasCalmas++;
			}
			if (humor == 2 && sexo ==1) {
				quantMulheresNervosas++;
			}
			if (humor == 3 && sexo ==2) {
				quantHomensAgressivos++;
			}
			if (humor == 1 && sexo ==3) {
				quantiOutrosCalmos++;
			}
			if (idade>40 && humor ==2) {
				quantiNervososMaisde40Anos++;
			}
			if (idade<18 && humor ==1) {
				quantiCalmasMenosDe18Anos++;
			}
		}
		System.out.println("número de pessoas calmas : "+ quantPessoasCalmas);
		System.out.println("número de mulheres nervosas: "+quantMulheresNervosas);
		System.out.println(" número de homens agressivos : "+quantHomensAgressivos);
		System.out.println("número de outros calmos : "+quantiOutrosCalmos );
		System.out.println("número de pessoas nervosas com mais de 40 anos : "+quantiNervososMaisde40Anos);
		System.out.println("número de pessoas calmas com menos de 18 anos : "+quantiCalmasMenosDe18Anos);
		leia.close();
	}

}
