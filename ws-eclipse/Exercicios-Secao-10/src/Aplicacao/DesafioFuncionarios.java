package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;

public class DesafioFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Quantos funcionarios deseja registrar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (temId(lista, id)) {
				System.out.print("Esse Id existe! Tente novamente: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			lista.add(funcionario);
		}
		
		System.out.println();
		
		System.out.print("Entre com o codigo do funcionario que recebera o aumento: ");
		int idSalario = sc.nextInt();
		
		Funcionario funcionario = lista.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		
		//Integer pos = posicao(lista, idSalario);
		
		if(funcionario == null) {
			System.out.println("Esse Id nao existe!");
		} else {
			System.out.print("Entre com a porcentagem: ");
			double porcento = sc.nextDouble();
			funcionario.aumentoSalarial(porcento);
		}
		
		System.out.println();
		
		System.out.println("Lista de Funcionarios:");
		
		for(Funcionario func :lista) {
			System.out.println(func);
		}
		
		
		
		sc.close();
	}
	
	public static Integer posicao(List<Funcionario> lista, int id) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id){
			return i;
			}
		}
		return null;
	}
	
	public static boolean temId(List<Funcionario> lista, int id) {
		Funcionario funcionario = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
	}

}
