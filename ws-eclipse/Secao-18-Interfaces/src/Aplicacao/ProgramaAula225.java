package Aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Modelo.Entidades.AluguelDoCarro;
import Modelo.Entidades.Veiculo;
import Modelo.Sevicos.ImpostoBrasileiro;
import Modelo.Sevicos.ServicoAluguel;

public class ProgramaAula225 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel:");
		System.out.print("Modelo do carro: ");
		String carroModelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/aaaa hh:mm): ");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/aaaa hh:mm): ");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);
		
		AluguelDoCarro ac = new AluguelDoCarro(inicio, fim, new Veiculo(carroModelo));
		
		System.out.print("Entre com o preco por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Entre com o preco por dia: ");
		double precoPorDia = sc.nextDouble();
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorHora, precoPorDia, new ImpostoBrasileiro());
		
		servicoAluguel.processoDeFatura(ac);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + String.format("%.2f", ac.getFatura().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", ac.getFatura().getImposto()));
		System.out.println("Pagamento total: " + String.format("%.2f", ac.getFatura().getPagamentoTotal()));
		
		sc.close();
	}
}
