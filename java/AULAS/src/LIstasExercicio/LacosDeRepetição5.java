package LIstasExercicio;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
public class LacosDeRepeti��o5 {

	public static void main(String[] args) {

		int somatorio=0, numeros;
		
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("Digite um n�mero : ");
			numeros = leia.nextInt();
			if (numeros!=0) {
				somatorio+=numeros;
			}
		}while(numeros!=0);
		
		System.out.println("A soma dos n�meros digitados : "+ somatorio);

	}

}
