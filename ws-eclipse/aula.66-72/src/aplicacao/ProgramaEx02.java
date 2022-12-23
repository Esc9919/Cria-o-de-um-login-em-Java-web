package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class ProgramaEx02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.print("Nome: ");
		funcionario.nome = sc.next();
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println(funcionario);
		
		System.out.println();
		System.out.print("Qual a porcentagem do aumento de salario? ");
		double porcento = sc.nextDouble();
		funcionario.aumentoSalarial(porcento);
		
		System.out.println();
		System.out.println("Atualizacao das informacoes: " + funcionario);
		
		sc.close();
		
	}

}
