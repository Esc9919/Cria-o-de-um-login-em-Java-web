package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Companhia;
import Entidades.Contribuinte;
import Entidades.PessoaFisica;

public class ExercicioDeFixacao2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do #" + i + " Contribuinte:");
			System.out.print("Pessoa Fisica ou Companhia(p/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Rendimento Anual: ");
			double rendaAnual = sc.nextDouble();
			if (ch == 'p') {
				System.out.print("Gastos com Saude: ");
				double gastosSaude = sc.nextDouble();
				Contribuinte contri = new PessoaFisica(nome, rendaAnual, gastosSaude);
				list.add(contri);
			} else {
				System.out.print("Numero de Funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				Contribuinte contri = new Companhia(nome, rendaAnual, numeroFuncionarios);
				list.add(contri);
			}
		}
		
		System.out.println();
		System.out.println("Impostos Pagos:");
		for (Contribuinte contribuinte : list) {
			System.out.printf("%s: $ %.2f\n", contribuinte.getNome(), contribuinte.taxa());
		}
		
		double soma = 0.0;
		for (Contribuinte contribuinte : list) {
			soma += contribuinte.taxa();
		}
		
		System.out.println();
		System.out.printf("Total de imposto pago: %.2f", soma);
		
		sc.close();
		
	}

}
