package LIstasExercicio;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class LacosDeRepeti��o6 {

	public static void main(String[] args) {

		int numeros, multDe3=0, quantMultDe3=0, mediaMultDe3;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero : ");
			numeros = leia.nextInt();
			if(numeros%3==0) {
				multDe3+=numeros;
				quantMultDe3++;
			}
			
		}while(numeros!=0);
		mediaMultDe3=multDe3/quantMultDe3;
		System.out.println("A media dos n�meros m�ltiplos de 3 digitados : "+mediaMultDe3);
		leia.close();

	}

}
