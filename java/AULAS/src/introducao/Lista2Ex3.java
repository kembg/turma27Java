package introducao;

import java.util.Scanner;

public class Lista2Ex3 {

	public static void main(String[] args) {
		/*3-	Fa�a um programa que receba a idade de uma pessoa e 
		 * mostre na sa�da em qual categoria ela se encontra:
�	10-14 infantil
�	15-17 juvenil
�	18-25 adulto
*/		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade : ");
		idade = leia.nextInt();
		
		if (idade<=25) {
			if (idade >=18) {
				System.out.println("Categoria adulto");
			}else if(idade>=15) {
				System.out.println("Categoria juvenil");
			}else if(idade>=10) {
				System.out.println("Categoria infantil");
			}else {
				System.out.println("N�o h� categoria dispon�vel");
			}
		} else {
			System.out.println("N�o h� categoria dispon�vel");
		}

	}

}
