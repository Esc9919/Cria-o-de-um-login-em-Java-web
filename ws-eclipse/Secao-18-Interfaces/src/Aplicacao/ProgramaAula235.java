package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Modelo.Sevicos.ServicoDeJuros;
import Modelo.Sevicos.ServicoDeJurosAmericano;

public class ProgramaAula235 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double quantia = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		ServicoDeJuros sjb = new ServicoDeJurosAmericano(1.0);
		double pagamento = sjb.pagamento(quantia, meses);
		
		System.out.println(meses + " meses apos o pagamento:");
		System.out.println(String.format("%.2f", pagamento));
		
		sc.close();
	}
}
