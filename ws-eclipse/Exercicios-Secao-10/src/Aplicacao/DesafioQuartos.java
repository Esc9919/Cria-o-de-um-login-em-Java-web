package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Quartos;

public class DesafioQuartos {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quartos[] vetor = new Quartos[10];
		
		System.out.print("Quantos quartos serao reservados? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Quarto #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quartoNum = sc.nextInt();
			
			vetor[quartoNum] = new Quartos(nome, email);
			
		}
		
		System.out.println();
		System.out.println("Ocupacao dos quartos:");
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
			
		}
		
		sc.close();
		
		
	}
	
}
