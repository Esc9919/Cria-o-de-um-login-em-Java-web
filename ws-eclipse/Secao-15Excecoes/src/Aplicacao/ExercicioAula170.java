package Aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioAula170 {

	public static void main(String[] args) {

		metodo1();
		
		System.out.println("Programa Encerrado");
		
	}
	
	public static void metodo1() {
		System.out.println("***METODO1 START***");
		
		metodo2();
		
		System.out.println("***METODO1 END***");
	}

	public static void metodo2() {
		System.out.println("***METODO2 START***");
		
		Scanner sc = new Scanner(System.in);
		try {
			String[] vetor = sc.nextLine().split(" ");
			int posicao =  sc.nextInt();
			System.out.println(vetor[posicao]);
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posicao Invalida");
				e.printStackTrace();
				sc.next();
			}
			
			catch(InputMismatchException e) {
				System.out.println("Erro de entrada");
			}
		
		sc.close();
		System.out.println("***METODO2 END***");
	}
	
}
