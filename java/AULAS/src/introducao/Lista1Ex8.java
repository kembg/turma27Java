package introducao;

import java.util.Scanner;

public class Lista1Ex8 {

	public static void main(String[] args) {
		/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		 *  percentagem do distribuidor e  dos impostos (aplicados ao custo de f�brica).
		 *   Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		  escrever um sistema que leia o custo de f�brica de um carro e 
		  escreva o custo ao consumidor. */ 
		
		double custoFabrica, impostos, custoConsumidor, porcentagemDistribuidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo de fabrica��o do carro : ");
		custoFabrica = leia.nextDouble();
		
		porcentagemDistribuidor = (custoFabrica*28)/100;
		impostos = (custoFabrica*45)/100;
		custoConsumidor = custoFabrica + porcentagemDistribuidor + impostos; 
		
		System.out.printf("O pre�o do carro para o consumidor � de %.2f reais.", custoConsumidor);

	}

}
