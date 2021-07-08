package introducao;

import java.util.Scanner;
import java.lang.Math;

public class Lista2Ex4 {

	public static void main(String[] args) {
		/*4-	Faça um programa em que permita a entrada de um número qualquer e 
		 * exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada
		 *  do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
		
		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um número : ");
		numero = leia.nextDouble();
		
		if (numero%2==0) {
			System.out.printf("O número %.0f é par e sua raiz quadrada é %.1f", numero, Math.sqrt(numero));
			
		} else {
			System.out.printf("O número %.0f é par e seu valor ao quadrado é %.1f", numero, Math.pow(numero, 2));

		}

	}

}
