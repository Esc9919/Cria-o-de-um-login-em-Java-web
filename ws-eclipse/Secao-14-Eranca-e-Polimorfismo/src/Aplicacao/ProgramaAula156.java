package Aplicacao;

import Entidades.Conta;
import Entidades.ContaCorporativa;
import Entidades.ContaPoupanca;

public class ProgramaAula156 {

	public static void main(String[] args) {
		
		//Conta c = new Conta(1001, "Alex", 0.00);
		ContaCorporativa cc = new ContaCorporativa(1002, "Maria", 0.00, 500.00);
		
		// UPCASTING
		
		Conta c1 = cc;
		Conta c2 = new ContaCorporativa(1003, "Bob", 0.00, 200.00);
		Conta c3 =  new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		ContaCorporativa c4 = (ContaCorporativa)c2;
		c4.emprestimo(100.00);
		
		//ContaCorporativa c5 = (ContaCorporativa)c3;
		if (c3 instanceof ContaCorporativa) {
			ContaCorporativa c5 = (ContaCorporativa)c3;
			c5.emprestimo(200.00);
			System.out.println("Emprestimo");
		}
		
		if (c3 instanceof ContaPoupanca) {
			ContaPoupanca c5 = (ContaPoupanca)c3;
			c5.atualizacaoDoSaldo();
			System.out.println("Atualizou!");
		}
		
	}
	
}
