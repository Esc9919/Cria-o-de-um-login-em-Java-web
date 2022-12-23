package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.Conversor;

public class ProgramaAula72 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preco do Dolar $: ");
		double dolarHoje = sc.nextDouble();
		System.out.print("Quantos dolars voce vai converter? ");
		double dolar = sc.nextDouble();
		double resultado = Conversor.conversor(dolar, dolarHoje);
		
		System.out.printf("O preco em reais sera = R$%.2f", resultado);
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
