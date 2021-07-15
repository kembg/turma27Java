package LIstasExercicio;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
public class LacosDeRepetição5 {

	public static void main(String[] args) {

		int somatorio=0, numeros;
		
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("Digite um número : ");
			numeros = leia.nextInt();
			if (numeros!=0) {
				somatorio+=numeros;
			}
		}while(numeros!=0);
		
		System.out.println("A soma dos números digitados : "+ somatorio);

	}

}
