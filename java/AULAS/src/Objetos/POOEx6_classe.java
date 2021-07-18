package Objetos;
/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/

//CONTA CORRENTE//

public class POOEx6_classe {
	
	private String nomeCliente;
	private String numeroDaConta;
	private double saldo;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double getSaldo() {
		System.out.println("O saldo atual é : "+saldo);
		return saldo;
	}
	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
	
	public void credito(double valorcred) {
		if (valorcred>0) {
		this.saldo += valorcred;
		System.out.println("Valor de saldo atualizado é : "+saldo);
		} else {
			System.out.println("Valor inválido.");
		}
	}
	
	public void debito(double valordeb) {
		if(valordeb <= 0) {
				System.out.println("Não é possível realizar o débito");	
			}
			else if(valordeb > saldo) {
				System.out.println("Valor de saldo indisponível, realize um crédito");
			}else {
				this.saldo -= valordeb;	
				System.out.println("Valor de saldo atualizado é : "+saldo);
			}
		}
	
	
}
