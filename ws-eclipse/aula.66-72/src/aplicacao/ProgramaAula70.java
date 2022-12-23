package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.Calculador;


public class ProgramaAula70 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o valor do raio: ");
		double radius = sc.nextDouble();
		
		double c = Calculador.circunferencia(radius);
		
		double v = Calculador.volume(radius);
		
		System.out.printf("Circunferencia: %.2f\n", c);
		System.out.printf("Volume %.2f\n", v);
		System.out.printf("Valor de PI %.2f\n", Calculador.PI);
		
		sc.close();
		
		
	}
	
}
