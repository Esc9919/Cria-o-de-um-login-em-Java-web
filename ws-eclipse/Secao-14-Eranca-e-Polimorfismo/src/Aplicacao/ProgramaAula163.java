package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Entidades.Conta;
import Entidades.ContaCorporativa;
import Entidades.ContaPoupanca;

public class ProgramaAula163 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		List<Conta> list =  new ArrayList<>();
		
		list.add(new ContaPoupanca(1001, "Alex", 500.0, 0.01));
		list.add(new ContaCorporativa(1002, "Maria", 1000.0, 400.0));
		list.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
		list.add(new ContaCorporativa(1005, "Anna", 500.0, 500.0));
		
		double soma = 0.0;
		for (Conta conta : list) {
			soma += conta.getSaldo();
		}
		
		System.out.printf("Saldo total: %.2f\n", soma);
		
		for (Conta conta : list) {
			conta.deposito(10.0);
		}for (Conta conta : list) {
			System.out.printf("Atualizacao da conta %d: %.2f\n", conta.getNumero(), conta.getSaldo());
		}
		
		
		
	}
	
}
