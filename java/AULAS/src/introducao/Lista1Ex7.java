package introducao;

import java.util.Scanner;

public class Lista1Ex7 {

	public static void main(String[] args) {

/*7. Um sistema de equações lineares do tipo: 
 *  ax + by = c
 *  dx + ey = f
 *  pode ser resolvido seguido mostrado abaixo : 
 *  x = (ce - bf)/(ae - bd); y = (af - cd)/(ae - bd) 
 *  Escreva um sistema que lê os coeficientes a, b, c, d, e e f 
 *  e calcula e mostra os valores de x e y. 
 */
		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de a : ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de b : ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de c : ");
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de d : ");
		d = leia.nextDouble();
		
		System.out.println("Digite o valor de e : ");
		e = leia.nextDouble();
		
		System.out.println("Digite o valor de f : ");
		f = leia.nextDouble();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		System.out.printf("O valor de x é : %f.\nO valor de y é : %f.", x, y);
		

	}

}
