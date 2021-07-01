package introducao;

import java.util.Scanner;
import java.lang.Math;

public class Lista1Ex4 {

	public static void main(String[] args) {
		/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
		 * e calcule a seguinte expressão: 
		 * D=(R+S/2), onde R=(A+B)^2 e S=(B+C)^2  */	
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, r, s;
		
		System.out.println("Digite o valor de A : ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B : ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C : ");
		c = leia.nextInt();
		
		
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r+s)/2;
		
		System.out.printf("Valor de r : %d; \nValor de s : %d; \nValor de d : %d.",r,s,d);
		
		

	}

}
