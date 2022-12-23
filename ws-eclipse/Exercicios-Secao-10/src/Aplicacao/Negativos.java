package Aplicacao;
import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int resp = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int[resp];
		
		for(int i = 0; i < resp; i++) {
			System.out.print("Digite um numero: ");
			int n = sc.nextInt();
			vect[i] = n;
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
