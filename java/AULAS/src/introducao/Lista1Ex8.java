package introducao;

import java.util.Scanner;

public class Lista1Ex8 {

	public static void main(String[] args) {
		/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		 *  percentagem do distribuidor e  dos impostos (aplicados ao custo de fábrica).
		 *   Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		  escrever um sistema que leia o custo de fábrica de um carro e 
		  escreva o custo ao consumidor. */ 
		
		double custoFabrica, impostos, custoConsumidor, porcentagemDistribuidor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo de fabricação do carro : ");
		custoFabrica = leia.nextDouble();
		
		porcentagemDistribuidor = (custoFabrica*28)/100;
		impostos = (custoFabrica*45)/100;
		custoConsumidor = custoFabrica + porcentagemDistribuidor + impostos; 
		
		System.out.printf("O preço do carro para o consumidor é de %.2f reais.", custoConsumidor);

	}

}
