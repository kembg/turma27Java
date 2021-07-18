package Objetos;

public class POOEx7_objeto {

	public static void main(String[] args) {
		
		POOEx7_classe paciente = new POOEx7_classe();
		
		paciente.setNome("Vitor");
		paciente.setIdade(10);
		paciente.genero('M');
		paciente.pediatria();
		paciente.triagem(false, false, false, true);
		
		System.out.println(paciente.getNome());
		System.out.println(paciente.getIdade());
		System.out.println(paciente.getSexo());
		System.out.println(paciente.getEspecialidade());
		System.out.println(paciente.getNivelUrgencia());

	}

}
