package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.CodigoAluno;

public class ExercicioAula247 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<CodigoAluno> set = new HashSet<>();

		for (int i = 1; i <= 3; i++) {
			System.out.print("Quantos alunos avera no curso " + i + ": ");
			Integer n = sc.nextInt();
			for (int j = 1; j <= n; j++) {
				int cod = sc.nextInt();
				set.add(new CodigoAluno(cod));
			}
		}

		System.out.println("Total de alunos: " + set.size());

		sc.close();
	}

}
