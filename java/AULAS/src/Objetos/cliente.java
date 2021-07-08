package Objetos;

public class cliente {
	
	public int anoNascimento;
	public char genero;
	public double orcamento;
	public String nome;
	public int itens;
	public double valorGasto;
	public String estadoCivil;
	
	
	public int mostrarIdade(int anoNascimento){
		return  (2021-anoNascimento);
	}
	
	public void generoCliente(char genero) {
		if (genero == 'M' || genero =='m' ) {
			System.out.println("Gênero masculino");
		}else if (genero =='f'|| genero == 'F') {
			System.out.println("Gênero feminino");
		} else {
			System.out.println("Gênero neutro/não binário");
		}
		
	}
	
}
