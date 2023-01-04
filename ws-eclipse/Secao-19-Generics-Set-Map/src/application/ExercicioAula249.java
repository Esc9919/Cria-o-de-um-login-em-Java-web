package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioAula249 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> candidato = new LinkedHashMap<>();
		
		System.out.print("Entre com o caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			while (linha != null) {
				
				String[] fields = linha.split(",");
				String nome = fields[0];
				int votos = Integer.parseInt(fields[1]);
				
				if (candidato.containsKey(nome)) {
					int votosCont = candidato.get(nome);
					candidato.put(nome, votos + votosCont);
				} else {
					candidato.put(nome, votos);
				}
				
				linha = br.readLine();
			}
			
			for (String key : candidato.keySet()) {
				System.out.println(key + ": " + candidato.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("erros: " + e.getMessage());
		}
		
		sc.close();
	}

}
