package introducao;

import java.util.Scanner;

public class Lista1Ex3 {

	public static void main(String[] args) {
		/* 3. Faça um sistema que leia o tempo de duração de um evento em
		 *  uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. */
		double segundosEvento, horas, minutos, segundos;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quantos segundos durou o evento ? ");
		segundosEvento = leia.nextDouble();
		
		horas = segundosEvento/3600;
		minutos = (segundosEvento%3600)/60;
		segundos = (segundosEvento%3600)%60;
		
		System.out.printf(" O evento durou %d horas, %d minutos e %d segundos", (int)horas, (int)minutos, (int)segundos);

	}

}
