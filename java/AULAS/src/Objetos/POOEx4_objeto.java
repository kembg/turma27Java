package Objetos;
/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

public class POOEx4_objeto {

	public static void main(String[] args) {
		
		POOEx4_classe funcionario = new POOEx4_classe();
		
		funcionario.setNome("Jessica");
		funcionario.indentidadeDeGenero('F');
		funcionario.setSalario(1000.5);
		funcionario.setBateuPonto(false);
		funcionario.faltou();
		funcionario.descontarSalario();
		funcionario.setDiaDeFolga("Sexta-feira");
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getGenero());
		System.out.println(funcionario.getDiaDeFolga());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getDiaDeFolga());
		System.out.println(funcionario.getFaltas());

	}

}
