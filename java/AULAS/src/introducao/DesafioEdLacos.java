package introducao;

import java.util.Scanner;

public class DesafioEdLacos {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero positivo : ");
		numero = leia.nextInt();
		
		if (numero > 0 && numero%2==0) {
			System.out.println("O n�mero "+numero+" � par.");
		} else if (numero >0 && numero%2==1) {
			System.out.println("O numero "+numero+" � �mpar.");
		} else if (numero == 0) {
			System.out.println("O numero � 0, portanto neutro.");
		} else {
			System.out.println("Valor inv�lido.");
		}
		
	}

}
