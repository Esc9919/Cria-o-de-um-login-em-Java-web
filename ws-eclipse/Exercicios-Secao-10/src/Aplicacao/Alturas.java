package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] vetorNome = new String[n];
		int[] vetorIdade = new int[n];
		double[] vetorTamanho = new double[n];
		
		for (int i = 0; i < vetorNome.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			vetorNome[i] = sc.next();
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();
			System.out.print("Tamanho: ");
			vetorTamanho[i] = sc.nextDouble();
			
		}
		double somaTam = 0.0;
		int somaId = 0;
		
		for (int i = 0; i < vetorNome.length; i++) {
			somaTam += vetorTamanho[i];
			if(vetorIdade[i] < 16) {
				somaId ++;
			}
		}
		
		double media = somaTam / vetorTamanho.length;
		
		double porcento = somaId * 100.0 / vetorIdade.length;
		
		System.out.println();
		System.out.printf("Altura media: %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcento);
		
		for (int i = 0; i < vetorNome.length; i++) {
			if(vetorIdade[i] < 16) {
				System.out.println(vetorNome[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
