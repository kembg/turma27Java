package LIstasExercicio;

import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
public class LacosDeRepeticão2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeros, numerosImpar=0, numerosPar=0;
		for (int i=1;i<=10;i++) {
			System.out.println("Digite um número : ");
			numeros = leia.nextInt();
			if (numeros%2==0) {
				numerosPar++;
			}else {
				numerosImpar++;
			}
		}
		System.out.println("Quantidade de números pares : "+numerosPar);
		System.out.println("Quantidade de números ímpares : "+numerosImpar);
		leia.close();
	}

}
