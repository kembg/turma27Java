package LIstasExercicio;

import java.util.Scanner;

/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
public class LacosDeRepetic�o2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeros, numerosImpar=0, numerosPar=0;
		for (int i=1;i<=10;i++) {
			System.out.println("Digite um n�mero : ");
			numeros = leia.nextInt();
			if (numeros%2==0) {
				numerosPar++;
			}else {
				numerosImpar++;
			}
		}
		System.out.println("Quantidade de n�meros pares : "+numerosPar);
		System.out.println("Quantidade de n�meros �mpares : "+numerosImpar);
		leia.close();
	}

}
