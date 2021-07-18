package Objetos;

/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

public class POOEx4_classe {
	
	private String nome;
	private double salario;
	private String diaDeFolga;
	private boolean bateuPonto;
	private int faltas;
	private String genero;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDiaDeFolga() {
		return diaDeFolga;
	}
	public void setDiaDeFolga(String diaDeFolga) {
		this.diaDeFolga = diaDeFolga;
	}
	public boolean isBateuPonto() {
		return bateuPonto;
	}
	public void setBateuPonto(boolean bateuPonto) {
		this.bateuPonto = bateuPonto;
	}
	public int getFaltas() {
		return faltas;
	}
	/*public void setFaltas(int faltas) {
		this.faltas = faltas;
	}*/
	public String getGenero() {
		return genero;
	}
	/*public void setGenero(String genero) {
		this.genero = genero;
	}*/
	
	public void indentidadeDeGenero(char x) {
		 if (x=='M') {
			 genero = "Masculino";
		 }
		 if (x=='F') {
			 genero = "Feminino";
		 }
		 if (x=='O') {
			 genero = "Outros";
		 }
	}
	
	public void faltou () {
		if (bateuPonto == false) {
			faltas++;
		}
	}
	
	public void descontarSalario() {
		salario = salario-(20*faltas);
	}
	
	
	

}
