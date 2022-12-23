package Aplicacao;

import Entidades.Conta;
import Entidades.ContaCorporativa;
import Entidades.ContaPoupanca;

public class ProgramaAula158 {

	public static void main(String[] args) {
		
	/*	Conta c1 = new Conta(1001, "Alex", 1000.00);
		c1.saque(200.00);
		System.out.println(c1.getSaldo()); */
		
		Conta c2 = new ContaPoupanca(1002, "Maria", 1000.00, 0.01);
		c2.saque(200.00);
		System.out.println(c2.getSaldo());
		
		Conta c3 = new ContaCorporativa(1003, "Bob", 1000.00, 500.00);
		c3.saque(200.00);
		System.out.println(c3.getSaldo());
		
	}
	
}
