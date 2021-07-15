package LIstasExercicio;

import java.util.Scanner;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

public class ListaVetoresMatrizes2 {

	public static void main(String[] args) {
		int [] valorDado = new int [10];
		int maiorValor=0, quantMaiorValor=0, somatorio=0;
		double mediaValor;
		
		Scanner leia = new Scanner(System.in);
		
		for (int i =0; i<10; i++) {
			System.out.println("Digite o valor do lançamento "+ (i+1)+" : ");
			valorDado[i]= leia.nextInt();
			somatorio+=valorDado[i];
			if (valorDado[i]>maiorValor) {
				maiorValor=valorDado[i];
			}
		}
		for (int i =0; i <10; i++) {
			if (valorDado[i]==maiorValor) {
				quantMaiorValor++;
			}
		}
		mediaValor = somatorio/10;
		
		System.out.println("A média  aritmética dos lançamentos : "+mediaValor);
		System.out.println("A maior pontuação : "+ maiorValor);
		System.out.println("A quanitdade de vezes que a maior pontuação apareceu : "+quantMaiorValor);

	}

}
