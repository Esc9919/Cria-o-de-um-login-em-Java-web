package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Desafio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			List<Funcionario> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Entre com o salario a ser filtrado: ");
			double digSalario = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(f -> f.getSalario() > digSalario)
					.map(f -> f.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			double soma = list.stream()
					.filter(f -> f.getNome().charAt(0) == 'M')
					.map(f -> f.getSalario())
					.reduce(0.0, (x,y) -> x + y );
			
			System.out.println("Emails cujo salarios maiores que $" + String.format("%.2f", digSalario) + ":");
			emails.forEach(System.out::println);
			
			System.out.println("A soma dos salarios das pessoas com o nome que comecam com a leta 'M': $" + String.format("%.2f", soma));
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
	}

}
