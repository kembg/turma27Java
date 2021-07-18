package Objetos;
/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class POOEx7_classe {
	
	private String nome;
	private int idade;
	private String especialidade;
	private int nivelUrgencia;
	private String sexo;
	
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
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getNivelUrgencia() {
		return nivelUrgencia;
	}
	/*public void setNivelUrgencia(int nivelUrgencia) {
		this.nivelUrgencia = nivelUrgencia;
	}*/
	public String getSexo() {
		return sexo;
	}
	/*public void setSexo(String sexo) {
		this.sexo = sexo;
	}*/
	
	public void genero (char x) {
		if (x =='F') {
			sexo = "Feminino";
		}
		else if(x == 'M') {
			sexo = "Masculino";
		}
		else {
			sexo = "Outros";
		}
	}
	
	public void triagem(boolean grupoRisco, boolean PercaSangue, boolean fatalidade, boolean outrasComplicacoes) {
		
		if (grupoRisco == true) {
			nivelUrgencia++;
		}
		if (PercaSangue == true) {
			nivelUrgencia++;
		}
		if (fatalidade == true) {
			nivelUrgencia++;
		}
		if (outrasComplicacoes == true) {
			nivelUrgencia+=3;
		}
	}
	
	public void pediatria() {
		if (idade<16) {
			especialidade = "Pediatria";
		}
	}
	
	

}
