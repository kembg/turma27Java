package collectionsex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

public class coll {

	public static void main(String[] args) {
		
		List<String>produto = new ArrayList<>();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o produto : ");
		String prode0 = leia.nextLine();
		System.out.println("Digite o produto : ");
		String prode1 = leia.nextLine();
		System.out.println("Digite o produto : ");
		String prode2 = leia.nextLine();
		
		
		produto.add(prode0);
		produto.add(prode1);
		produto.add(prode2);
		
		for (String prod : produto) {
			System.out.println();
			System.out.printf("%d - %s  ", produto.indexOf(prod), prod);

		}
		
		produto.remove(prode0);
		
		for (String prod : produto) {
			System.out.println();
			System.out.println(prod);
		}
		
		produto.set(0, "sazon");
		for (String prod : produto) {
			System.out.println();
			System.out.println(prod);
		}

	}

}
