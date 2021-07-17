package Objetos;

public class POOEx3_objeto {

	public static void main(String[] args) {
		
		POOEx3_classe caixaMusica = new POOEx3_classe();
		
		caixaMusica.setMarca("JBL");
		caixaMusica.setModelo("‎JBLGO2BLK");
		caixaMusica.setVoltagem(4.8);
		caixaMusica.setAnoLancamento(2018);
		caixaMusica.ligar();
		caixaMusica.carregar(100);
		caixaMusica.ligar();
		caixaMusica.conectar();
		caixaMusica.play();
		caixaMusica.aumentar(100);
		caixaMusica.diminuir(50);
		caixaMusica.pause();
		caixaMusica.setBluetooth(false);
		caixaMusica.desligar();


	}

}
