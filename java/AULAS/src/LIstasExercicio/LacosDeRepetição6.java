package LIstasExercicio;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class LacosDeRepetição6 {

	public static void main(String[] args) {

		int numeros, multDe3=0, quantMultDe3=0, mediaMultDe3;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número : ");
			numeros = leia.nextInt();
			if(numeros%3==0) {
				multDe3+=numeros;
				quantMultDe3++;
			}
			
		}while(numeros!=0);
		mediaMultDe3=multDe3/quantMultDe3;
		System.out.println("A media dos números múltiplos de 3 digitados : "+mediaMultDe3);
		leia.close();

	}

}
