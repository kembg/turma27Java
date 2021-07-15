package LIstasExercicio;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class LacosDeRepetição3 {
	public static void main (String [] args) {
		int idade=-1, pessoasMenosDe21=0, pessoasMaisDe50=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		while(idade!=-99) {
			System.out.println("Digite uma idade : ");
			idade = leia.nextInt();
			if (idade<21 && idade>=0) {
				pessoasMenosDe21++;
			} 
			if (idade>50) {
				pessoasMaisDe50++;
			}	
		}
		System.out.println("Pessoas com menos de 21 anos : "+pessoasMenosDe21);
		System.out.println("Pessoas com mais de 50 anos : "+pessoasMaisDe50);
	}
}
