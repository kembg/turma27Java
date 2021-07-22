package herancaPolimorfismo;

public class preguica extends serVivo {

	public boolean subirArvore;

	public preguica(String nome, int idade, boolean som, boolean subirArvore) {
		super(nome, idade, som);
		this.subirArvore = subirArvore;
	}

	public boolean isSubirArvore() {
		return subirArvore;
	}

	/*public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}*/
	
	public void subaArvore() {
		subirArvore = true;
		System.out.println("Subindo árvore...");
	}
	@override 
	public void emitirSom(boolean barulho) {
		barulho = true;
		System.out.println("a mimir");
	}
}
