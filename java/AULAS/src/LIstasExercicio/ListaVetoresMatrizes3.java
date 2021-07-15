package LIstasExercicio;

import java.util.Scanner;

/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

public class ListaVetoresMatrizes3 {

	public static void main(String[] args) {
		
		int [][] matrizN1 = new int  [4][6];
		int [][] matrizN2 = new int  [4][6];
		int [][] matrizM1 = new int  [4][6];
		int [][] matrizM2 = new int  [4][6];
		
		Scanner leia = new Scanner(System.in);
		
		for (int linha =0; linha <4; linha++) {
			for (int coluna =0; coluna <6; coluna++) {
				System.out.printf("Diigite o elemento N1[%d][%d] : \n", linha+1, coluna+1);
				matrizN1[linha][coluna]=leia.nextInt();
				System.out.printf("Diigite o elemento N2[%d][%d] : \n", linha+1, coluna+1);
				matrizN2[linha][coluna]=leia.nextInt();
				matrizM1[linha][coluna]=(matrizN1[linha][coluna]+matrizN2[linha][coluna]);
				matrizM2[linha][coluna]=(matrizN1[linha][coluna]-matrizN2[linha][coluna]);
				
			}
		}
		System.out.println("Matriz M1 : ");
		for (int linha =0; linha <4; linha++) {
			for (int coluna =0; coluna <6; coluna++) {
				System.out.printf("\t %d \t", matrizM1[linha][coluna]);
			} System.out.println();
		}
		System.out.println("\nMatriz M2 : ");
		for (int linha =0; linha <4; linha++) {
			for (int coluna =0; coluna <6; coluna++) {
					System.out.printf("\t %d \t", matrizM2[linha][coluna]);
				}System.out.println();
			}
	}
}
