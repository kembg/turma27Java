package introducao;

import java.util.Scanner;

public class Lista1Ex2 {

	public static void main(String[] args) {
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e
		 *  mostre-a expressa em anos, meses e dias. 
		 */
		
		double anos, meses, dias, diasTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quanos dias de vida você tem ? ");
		diasTotal = leia.nextDouble();
		
		anos = (diasTotal/365);
		meses = (diasTotal%365)/30;
		dias = (diasTotal%3365)%30;
		
		System.out.printf(" Você tem %d anos, %d meses e %d dias de vida ", (int)anos, (int)meses, (int)dias);
	}

}
