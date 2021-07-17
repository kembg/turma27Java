package Objetos;
/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/
///CAIXINHA DE MUSICA ///
public class POOEx3_classe {
	
	private String marca;	
	private String modelo;
	private int anoLancamento;
	private boolean carregador;
	private boolean bluetooth;
	private int porcentagemBateria=0;
	private boolean ligado;
	private int volume=0;
	private double voltagem;
	public int i=0;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public boolean isCarregador() {
		return carregador;
	}
	public void setCarregador(boolean carregador) {
		this.carregador = carregador;
	}
	public boolean isBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	public int getPorcentagemBateria() {
		return porcentagemBateria;
	}
	/*public void setPorcentagemBateria(int porcentagemBateria) {
		this.porcentagemBateria = porcentagemBateria;
	}*/
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getVolume() {
		return volume;
	}
	/*public void setVolume(int volume) {
		this.volume = volume;
	}*/
	public double getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}
	
	public void ligar() {
		if (porcentagemBateria>0) {
			ligado = true;
			System.out.println("Ligando...");
		}
		else {
			System.out.println("É necessário carregar o dispositivo. ");
		}
		
	}
	public void desligar() {
		if (bluetooth==true) {
			System.out.println("Desligue o bluetooth antes de desligar");
		}
		else {
			System.out.println("Desligando...");
		}
	}
	public void conectar() {
		if (ligado == true) {
			bluetooth = true;
			System.out.println("Conectando a um dispositivo...");
		} 
	}
	public void carregar(int tempoMinutos) {
		if (tempoMinutos>0 && porcentagemBateria <100) {
			porcentagemBateria+=(1*tempoMinutos);
		}
	}
	public void bateria() {
		if (porcentagemBateria>0) {
			System.out.println("A bateria está em "+porcentagemBateria+"%.");
		}
		
		if (porcentagemBateria<=20) {
			System.out.println("É recomendavél colocar o dispositivo para carregar.");
		}
	}
	public void play() {
		if (bluetooth == true) {
			System.out.println("Tocando música...");
			i++;
		}
	}
	
	public void pause() {
		if(i>0) {
			System.out.println("Pausando a música...");
			i = i - i;
		}
	}
	public void aumentar(int acrescimo) {
		if (volume>=100) {
			System.out.println("O volume está no máximo.");
		}
		else if ((volume+acrescimo)>100){
			System.out.println("Volume não disponível");
		}
		else {
			volume+=acrescimo;
			System.out.println("Aumentando o volume...");
			System.out.println("Volume atual : "+volume);
		}
	}
	public void diminuir (int decrescimo) {
		if (volume==0) {
			System.out.println("O volume está no minímo.");
		}
		else if ((volume-decrescimo)<0){
			System.out.println("Volume não disponível");
		}
		else {
			volume-=decrescimo;
			System.out.println("Diminuindo o volume...");
			System.out.println("Volume atual : "+volume);
		}
	}
	
}
