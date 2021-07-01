package introducao;

import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {
		/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos
		, meses e dias e mostre-a expressa apenas em dias.*/ 
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, diasTotal;
		
		System.out.println("Quantos anos você tem ? ");
		anos = leia.nextInt();
		
		System.out.println("e quantos meses ? ");
		meses = leia.nextInt();
		
		System.out.println(" e quantos dias ? ");
		dias = leia.nextInt();
		
		diasTotal= anos*365;
		diasTotal+= meses*30;
		diasTotal+= dias;
		
		System.out.println(" Você tem "+diasTotal+" dias de vida.");

	}

}
