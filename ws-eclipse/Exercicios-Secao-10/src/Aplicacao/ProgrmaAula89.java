package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.ProdutoAula89;

public class ProgrmaAula89 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProdutoAula89[] vect = new ProdutoAula89[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new ProdutoAula89(nome, preco);
			
		}
		
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Preco medio = %.2f", media);
		
		
		sc.close();
		
		
	}

}
