package Objetos;

/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class POOEx5_classe {
	
	private String modelo;
	private int idadeRecomendavel;
	private int rodas;
	private boolean freio;
	private int guidao;
	private boolean equipamentoProtecao;
	private int velocidade;
	private int i;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getIdadeRecomendavel() {
		return idadeRecomendavel;
	}
	public void setIdadeRecomendavel(int idadeRecomendavel) {
		this.idadeRecomendavel = idadeRecomendavel;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public boolean isFreio() {
		return freio;
	}
	public void setFreio(boolean freio) {
		this.freio = freio;
	}
	public int getGuidao() {
		return guidao;
	}
	public void setGuidao(int guidao) {
		this.guidao = guidao;
	}
	public boolean isEquipamentoProtecao() {
		i++;
		return equipamentoProtecao;
	}
	public void setEquipamentoProtecao(boolean equipamentoProtecao) {
		this.equipamentoProtecao = equipamentoProtecao;
	}
	public int getVelocidade() {
		System.out.println("Sua velocidade atual é : "+velocidade);
		return velocidade;
	}
	
	public void andar() {
		if (equipamentoProtecao == true) {
			System.out.println("Andando..");
			i++;
		}
		else {
			System.out.println("Coloque equipamentos de proteçaõ.");
		}
	}
	
	public void acelerar(int acrescimo) {
		if ( acrescimo>0 && velocidade<20 && i>=1) {
			velocidade +=acrescimo;
			System.out.println("Acelerando...");
			i++;
		}
		else if (velocidade>20) {
			System.out.println("Você já está indo muito rápido.");
		}
		else if (equipamentoProtecao==false) {
			System.out.println("Coloque equipamento de proteção.");
		}
	}
	public void frear(int decrescimo) {
		if (velocidade>0 && i>=1) {
			velocidade-=decrescimo;
			System.out.println("Freando...");
		}
		else {
			System.out.println("Você está parado.");
		}
	}
	public void parar() {
		if(velocidade>0 && i>=1) {
			velocidade = velocidade - velocidade;
			i= i - i;
			System.out.println("Parando...");
		}
		else {
			System.out.println("Voce está parado.");
		}
	}
	
	
	
}
