package introducao;

public class temperaturaCFK {

	public static void main(String[] args) {
		
		double celsius = 0, fa, kelvin;
		String nome = "ed";
		
		
		fa = (celsius * 9/5) + 32 ;
		kelvin = celsius + 273;
		
		System.out.println(nome+", a temperatura em graus Fahrenheit é : "+fa);
		System.out.println("e em graus Kelvin é : "+kelvin);
		

	}

}
