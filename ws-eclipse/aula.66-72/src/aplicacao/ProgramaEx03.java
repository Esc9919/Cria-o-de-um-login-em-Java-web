package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluno;

public class ProgramaEx03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluno aluno = new Aluno();
		System.out.print("Nome do aluno: ");
		aluno.nome = sc.next();
		System.out.print("Primeira nota: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("Segunda nota: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("Terceira nota: ");
		aluno.n3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Nota final: %.2f\n", aluno.notaFinal());

		if(aluno.notaFinal() < 60) {
			System.out.println("Reprovou");
			System.out.printf("Faltaram %.2f pontos", aluno.pontosFaltaram());
		} else {
			System.out.println("Aprovou");
		}
		
		sc.close();
	}

}
