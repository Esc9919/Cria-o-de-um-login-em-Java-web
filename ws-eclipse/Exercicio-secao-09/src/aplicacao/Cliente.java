package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Cliente {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta cliente1;
		
		System.out.print("Numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("Nome do cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Deseja realizar um deposito (s/n)? ");
		char resp = sc.next().charAt(0);
		double depositoInicial;
		if(resp == 's') {
			System.out.print("Qual o velor do deposito: ");
			depositoInicial = sc.nextDouble();
			cliente1 = new Conta(conta, nome, depositoInicial);
		} else {
			cliente1 = new Conta(conta, nome);
		}
		
		System.out.println();
		
		
		
		System.out.println("Dados da Conta:");
		System.out.println(cliente1);
		
		System.out.println();		
		
		System.out.print("Entre com o valor do deposito: ");
		double deposito = sc.nextDouble();
		cliente1.deposita(deposito);
		
		System.out.println("Dados da Conta Atualizados:");
		System.out.println(cliente1);
		
		System.out.println();
		
		System.out.print("Entre com o valor do saque: ");
		double saque = sc.nextDouble();
		cliente1.saca(saque);
		
		System.out.println("Dados da Conta Atualizados:");
		System.out.println(cliente1);
		
		sc.close();
		
	}

}
