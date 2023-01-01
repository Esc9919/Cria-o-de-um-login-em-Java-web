package Aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Modelo.Entidades.Funcionario;

public class ProgramaAula234 {

	public static void main(String[] args) {
		
		List<Funcionario> list = new ArrayList<>();
		String path = "C:\\Users\\Public\\JavaUdemy\\funcionario.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String funcionarioCsv = br.readLine();
			while (funcionarioCsv != null) {
				String[] fields = funcionarioCsv.split(",");
				list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
				funcionarioCsv = br.readLine();
			}
			Collections.sort(list);
			for (Funcionario f : list) {
				System.out.println(f.getNome() + ", " + String.format("%.2f", f.getSalaior()));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
