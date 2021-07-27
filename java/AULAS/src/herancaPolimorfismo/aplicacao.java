package herancaPolimorfismo;

public class aplicacao {

	public static void main(String[] args) {
		
		serVivo animal = new serVivo("A", 2, false);
		animal.emitirSom();
		cachorro animal1 = new cachorro("Bob", 3, false, true);
		animal1.emitirSom();
		cavalo animal2 = new cavalo("Eduardo", 34, false, false);
		animal2.emitirSom();
		preguica animal3 = new preguica("Sid", 15, true, true);
		animal3.emitirSom();

	}

}
