package Objetos;
/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class POOEx2_classe {
	
	private String modelo;
	private boolean ligado;
	private boolean tremDePouso;
	private int velocidade = 0;
	private boolean passageiros;
	private boolean aeromoca;
	private boolean piloto;
	private boolean janelas;

	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isTremDePouso() {
		return tremDePouso;
	}
	public void setTremDePouso(boolean tremDePouso) {
		this.tremDePouso = tremDePouso;
	}
	public int getVelocidade() {
		return velocidade;
	}
	/*public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}*/
	public boolean isPassageiros() {
		return passageiros;
	}
	public void setPassageiros(boolean passageiros) {
		this.passageiros = passageiros;
	}
	public boolean isAeromoca() {
		return aeromoca;
	}
	public void setAeromoca(boolean aeromoca) {
		this.aeromoca = aeromoca;
	}
	public boolean isPiloto() {
		return piloto;
	}
	public void setPiloto(boolean piloto) {
		this.piloto = piloto;
	}
	public boolean isJanelas() {
		return janelas;
	}
	public void setJanelas(boolean janelas) {
		this.janelas = janelas;
	}
	public void ligar () {
		if (piloto == true) {
		ligado = true;
		System.out.println("Ligando..");
		}
	}
	
	
	public void acelerar(int acrescimo) {
		if (acrescimo>0 && ligado == true ) {
			velocidade+=acrescimo;
			System.out.println("Acelerando "+acrescimo+" km/h.");
			}
	}
	

	public void decolar() {
		
		if(ligado==true) {
			if (velocidade>=190 && tremDePouso == false) {
				System.out.println("Decolando...");
			}
			else if (velocidade<190 && tremDePouso == false) {
				System.out.println("É necessário aumentar a velocidade.");
			}
			else if (velocidade>=190 && tremDePouso == true ) {
				System.out.println("Comece a recolher os trens de pouso.");
			}
		}
	}
	
	public void desacelerar (int decrescimo) {
		velocidade-=decrescimo;
		System.out.println("Desacelerando "+decrescimo+" km/h.");
	}
	
	public void velocidadeAtual () {
		System.out.println("Velocidade atual : "+velocidade+" km/h.");
	}
	
	public void pousando() {
		if (velocidade<=145) {
			System.out.println("Iniciando procedimento de pouso.");
		}
		else {
			System.out.println("É necessário diminuir a velocidade para pousar.");
		}
	}
	
	public void desligar() {
		if (velocidade ==0 && tremDePouso == true) {
			System.out.println("Desligando...");
		}
	}
	
}
