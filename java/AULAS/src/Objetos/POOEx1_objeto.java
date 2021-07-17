package Objetos;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

/*TIRA OS COMENTÁTIOS E COLOCA EMBAIXO PRA ESCOLHER SUAS ENTRADAS.
import java.util.Scanner;*/

public class POOEx1_objeto {
	
	public static void main(String args[] ) {
		
		POOEx1_classe cliente = new POOEx1_classe();
		
		/*Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o nome do cliente : ");
		cliente.setNome(leia.next());
		
		System.out.println("Digite o sexo do cliente (F/M/O) : ");
		cliente.setSexo(leia.next().toUpperCase().charAt(0));
		
		System.out.println("Digite o orçamento do cliente : ");
		cliente.setOrcamento(leia.nextDouble());
		
		System.out.println("Digite quantos itens o cliente comprou : ");
		cliente.setItensComprados(leia.nextInt());
		
		System.out.println("Digite o valor gasto pelo cliente : ");
		cliente.setValorGasto(leia.nextDouble());*/
		
		cliente.setNome("Jessica");
		cliente.setSexo('F');
		cliente.setOrcamento(100.00);
		cliente.setItensComprados(7);
		cliente.setValorGasto(150.00);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getSexo());
		System.out.println(cliente.getOrcamento());
		System.out.println(cliente.getItensComprados());
		System.out.println(cliente.getValorGasto());
	}
}
