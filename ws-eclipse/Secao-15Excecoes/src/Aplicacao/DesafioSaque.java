package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Modelo.Entidades.Conta;
import Modelo.Excecoes.LimiteSaqueException;
import Modelo.Excecoes.SaldoException;

public class DesafioSaque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Entre com os dados da conta:");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			System.out.print("Cliente: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Saldo Inicial: ");
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteDeSaque = sc.nextDouble();
			
			Conta conta = new Conta(numero, nome, saldo, limiteDeSaque);
			
			System.out.println();
			System.out.print("Qual o valor da saque: ");
			conta.saque(sc.nextDouble());
			
			System.out.printf("Saldo $%.2f", conta.getSaldo());
			
		} catch(SaldoException e) {
			System.out.println(e.getMessage());
		} catch(LimiteSaqueException e) {
			System.out.println(e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("Erro Inesperado!");
		}
		
		sc.close();
	}

}
