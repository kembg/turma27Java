package LIstasExercicio;

import java.util.Scanner;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

public class ListaVetoresMatrizes2 {

	public static void main(String[] args) {
		int [] valorDado = new int [10];
		int maiorValor=0, quantMaiorValor=0, somatorio=0;
		double mediaValor;
		
		Scanner leia = new Scanner(System.in);
		
		for (int i =0; i<10; i++) {
			System.out.println("Digite o valor do lan�amento "+ (i+1)+" : ");
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
		
		System.out.println("A m�dia  aritm�tica dos lan�amentos : "+mediaValor);
		System.out.println("A maior pontua��o : "+ maiorValor);
		System.out.println("A quanitdade de vezes que a maior pontua��o apareceu : "+quantMaiorValor);

	}

}
