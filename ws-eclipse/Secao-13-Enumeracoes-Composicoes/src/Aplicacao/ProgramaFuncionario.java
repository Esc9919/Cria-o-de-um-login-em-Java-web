package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Departamento;
import Entidades.HorasContrato;
import Entidades.Trabalhador;
import Entidades.enums.TrabalhadorNivel;

public class ProgramaFuncionario {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String trabalhadorNome = sc.nextLine();
		System.out.print("Nivel: ");
		String trabalhadorNivel = sc.nextLine();
		System.out.print("Salario base: ");
		double salarioBase = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(trabalhadorNome, TrabalhadorNivel.valueOf(trabalhadorNivel), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos o trabalhador vai ter? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Entre com os dados do #" + i + " contrato: ");
			System.out.print("Data (DD/MM/AAAA): ");
			Date contratoData = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duracao (horas): ");
			int horas = sc.nextInt();
			HorasContrato contrato = new HorasContrato(contratoData, valorPorHora, horas);
			trabalhador.addContratos(contrato);
			
		}
		
		System.out.println();
		System.out.print("Entre com o mes e ano para calcular o contrato(MM/AAAA): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Recebidos de " + mesEAno + ": " + String.format("%.2f", trabalhador.recebido(ano, mes)));
		
		sc.close();
		
	}

}
