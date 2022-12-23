import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner resp = new Scanner(System.in);
		char resposta;

		do {
			System.out.println("Digite uma temperatura em graus Celsius: ");
			double celsius = resp.nextDouble();
			double fahrenheit = ((9 * celsius) / 5) + 32;
			System.out.printf("Equivalente em Fagrenheit: %.1f\n", fahrenheit);
			System.out.println("Deseja repetir (s/n)? ");
			resposta = resp.next().charAt(0);

		} while (resposta == 's');
		resp.close();
	}

}
