package Objetos;

public class POOEx5_objeto {

	public static void main(String[] args) {
		
		
		POOEx5_classe patinete = new POOEx5_classe();
			
		patinete.setModelo("TOWN 5 XL OXELO");
		patinete.setGuidao(1);
		patinete.setFreio(true);
		patinete.setIdadeRecomendavel(10);
		patinete.setEquipamentoProtecao(true);
		patinete.andar();
		patinete.acelerar(22);
		patinete.acelerar(2);
		patinete.frear(20);
		patinete.parar();
	}

}
