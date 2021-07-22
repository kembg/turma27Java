package herancaPolimorfismo;

public class serVivo {
	
	public String nome;
	public int idade;
	public boolean som;
	
	public serVivo(String nome, int idade, boolean som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSom() {
		return som;
	}

	/*public void setEmitirSom(boolean emitirSom) {
		this.emitirSom = emitirSom;
	}*/
	
	public void emitirSom() {
		som = true;
		System.out.println("Emitindo som...");
	}
	
	
	
	
}
