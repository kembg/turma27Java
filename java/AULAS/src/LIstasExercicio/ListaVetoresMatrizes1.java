package LIstasExercicio;

import java.util.Scanner;

/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

public class ListaVetoresMatrizes1 {

	public static void main(String[] args) {
		
		int [] notas = new int [5];
		int maiorNota=0;
		
		Scanner leia = new Scanner (System.in);
		
		for (int i =0; i<5; i++) {
			System.out.println("Digite uma nota : ");
			notas[i] = leia.nextInt();
			}
		
		for (int i=0;i<5;i++) {
			System.out.println("Nota "+(i+1)+" = "+notas[i]);
			if (notas[i]>maiorNota) {
				maiorNota=notas[i];
			}

		}
		System.out.println("A maior nota foi : "+maiorNota);
	}

}
