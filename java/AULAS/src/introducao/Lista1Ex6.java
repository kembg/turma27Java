package introducao;

import java.util.Scanner;
import java.lang.Math;

public class Lista1Ex6 {

	public static void main(String[] args) {
		/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
		 * P(x1, y1) e P(x2, y2), 
		 * escreva a distância entre eles. A fórmula é d= √(x2-x1)^2+(y2-y1)^2 que efetua tal cálculo é : */
				
				Scanner leia = new Scanner(System.in);
		
		
				double p1, p2, x1, y1, x2, y2, d;
				
				
				System.out.println("Qual o valor de x1 ? ");
				x1 = leia.nextDouble();
				
				System.out.println("Qual o valor de y1 ? ");
				y1 = leia.nextDouble();
				
				System.out.println("Qual o valor de x2 ? ");
				x2 = leia.nextDouble();
				
				System.out.println("Qual o valor de y2 ? ");
				y2 = leia.nextDouble();
				
				p1 = Math.pow((x2-x1), 2);
				p2 = Math.pow((y1-y2), 2);
				d = Math.sqrt((p1+p2));
				
				System.out.println("A distância entre os pontos é : "+d);
			}
		}
