package Objetos;

public class POOEx2_objeto {
	
	/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.*/


	public static void main(String[] args) {
		
		POOEx2_classe aviao = new POOEx2_classe();
		
		aviao.setModelo("Boeing 747-8");
		aviao.setAeromoca(true);
		aviao.setJanelas(true);
		aviao.setPiloto(true);
		aviao.setPassageiros(true);
		aviao.setTremDePouso(true);
		aviao.ligar();
		aviao.acelerar(200);
		aviao.decolar();
		aviao.setTremDePouso(false);
		aviao.decolar();
		aviao.acelerar(50);
		aviao.velocidadeAtual();
		aviao.pousando();
		aviao.desacelerar(105);
		aviao.pousando();
		aviao.setTremDePouso(true);
		aviao.velocidadeAtual();
		aviao.desacelerar(105);
		aviao.setPassageiros(false);
		aviao.setAeromoca(false);
		aviao.desligar();
		aviao.setPiloto(false);

	}

}
