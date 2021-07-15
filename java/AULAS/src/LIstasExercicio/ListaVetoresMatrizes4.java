package LIstasExercicio;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

public class ListaVetoresMatrizes4 {

	public static void main(String[] args) {
		
		int[][]matrizQuad=new int [3][3];
		int somatorio=0, diagonal=0;
		
		Scanner leia = new Scanner(System.in);
	
		for (int linha=0; linha<3; linha ++) {
			for ( int coluna =0; coluna<3; coluna++) {
				System.out.printf("Digite o elemento matrizQuad[%d][%d] : ", linha+1, coluna+1 );
				matrizQuad[linha][coluna]=leia.nextInt();
				somatorio+=matrizQuad[linha][coluna];
				if (matrizQuad[linha][linha]==matrizQuad[coluna][coluna]) {
					diagonal+=matrizQuad[linha][linha];
				}
			}
		}
		System.out.println("A soma dos valores da matriz : "+somatorio);
		System.out.println("A diagonal principal tem valor : "+diagonal);

	}

}
