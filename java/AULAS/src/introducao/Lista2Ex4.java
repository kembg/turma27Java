package introducao;

import java.util.Scanner;
import java.lang.Math;

public class Lista2Ex4 {

	public static void main(String[] args) {
		/*4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e 
		 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada
		 *  do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
		
		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um n�mero : ");
		numero = leia.nextDouble();
		
		if (numero%2==0) {
			System.out.printf("O n�mero %.0f � par e sua raiz quadrada � %.1f", numero, Math.sqrt(numero));
			
		} else {
			System.out.printf("O n�mero %.0f � par e seu valor ao quadrado � %.1f", numero, Math.pow(numero, 2));

		}

	}

}
