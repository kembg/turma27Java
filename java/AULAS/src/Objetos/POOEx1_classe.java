package Objetos;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class POOEx1_classe {
	
	private String nome;
	private String sexo;
	private double orcamento;
	private int itensComprados;
	private double valorGasto;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(char sx) {
		if (sx =='M') {
			this.sexo = "Masculino";
		}
		else if (sx =='F') {
			this.sexo ="Feminino";
		} else {
			this.sexo = "Outros";
		}
					}
	public double getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}
	public int getItensComprados() {
		return itensComprados;
	}
	public void setItensComprados(int itensComprados) {
		this.itensComprados = itensComprados;
	}
	public double getValorGasto() {
		return valorGasto;
	}
	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}
	
	
	
	
	
	

}
