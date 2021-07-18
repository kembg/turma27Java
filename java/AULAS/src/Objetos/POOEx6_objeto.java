package Objetos;
/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/

public class POOEx6_objeto {

	public static void main(String[] args) {

		POOEx6_classe contaCorrente = new POOEx6_classe();
		
		contaCorrente.setNomeCliente("Marcelo");
		contaCorrente.setNumeroDaConta("89574-3");
		contaCorrente.getSaldo();
		contaCorrente.credito(1000);
		contaCorrente.debito(1500);
		contaCorrente.debito(500);
		contaCorrente.getSaldo();
	}

}
