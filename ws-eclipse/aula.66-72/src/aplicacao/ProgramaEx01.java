package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Retangulo;

public class ProgramaEx01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Informe a largura e a altura de un retangulo:");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Area: %.2f\n", retangulo.area());
		System.out.printf("Parimetro: %.2f\n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f", retangulo.diagonal());
		
		
		sc.close();
		
	}

}
