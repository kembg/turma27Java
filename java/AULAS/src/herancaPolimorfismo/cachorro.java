package herancaPolimorfismo;

public class cachorro extends serVivo {
	
	public boolean correr;

	public cachorro(String nome, int idade, boolean som, boolean correr) {
		super(nome, idade, som);
		this.correr = correr;
	}

	public boolean isCorrer() {
		return correr;
	}

	/*public void setCorrer(boolean correr) {
		this.correr = correr;
	}*/

	public void corra() {
		correr = true;
		System.out.println("Correndo...");
	}
	
	@override 
	public void emitirSom(boolean barulho) {
		barulho = true;
		System.out.println("AU AU AU");
	}
	
	
	
}
