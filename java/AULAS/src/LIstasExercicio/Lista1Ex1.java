package LIstasExercicio;

import java.util.Scanner;

import Objetos.cliente;

public class Lista1Ex1 {
	/*Crie uma classe cliente e apresente os atributos e m�todos referentes esta 
	 * classe, em seguida crie um objeto cliente, defina as instancias deste objeto 
	 * e apresente as informa��es deste objeto no console.*/

	public static void main (String args[]) {
		
		cliente cliente1 = new cliente(); 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o nome do cliente ? ");
		cliente1.nome = leia.next();
		
		System.out.println("Qual o ano de nascimento ? ");
		cliente1.anoNascimento= leia.nextInt();
				
		System.out.println("Qual o g�nero (M/F/O) ? ");
		cliente1.genero = leia.next().charAt(0);
		
		System.out.println("Qual o estado civil ? ");
		cliente1.estadoCivil = leia.next();
		
		System.out.println ("Qual o or�amento do cliente ? ");
		cliente1.orcamento = leia.nextDouble();
		
		System.out.println("Qual quantidade de itens comprados ? ");
		cliente1.itens = leia.nextInt();
		
		System.out.println("Qual foi o valor gasto ? ");
		cliente1.valorGasto = leia.nextDouble();
		
		
		
		System.out.printf("Cliente %s, %s anos de vida, g�nero %s ", cliente1.nome, cliente1.mostrarIdade(cliente1.anoNascimento)) ;
		
		
		
		
		
	}
}
