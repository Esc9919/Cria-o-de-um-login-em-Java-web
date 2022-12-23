package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.FuncionarioTerceirizado;

public class ExercicioAula161 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero de funcionarios: ");
		int n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Entre com os dados do #" + i +  " funcionario:");
			System.out.print("O funcionario e terceirizado (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Pagamento adicional: ");
				double pagamentoAdicional = sc.nextDouble();
				Funcionario emp =  new FuncionarioTerceirizado(nome, horas, valorPorHora, pagamentoAdicional);
				list.add(emp);
			} else {
				Funcionario emp =  new Funcionario(nome, horas, valorPorHora);
				list.add(emp);
			}
			
		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		for (Funcionario emp : list) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
		}
		
		sc.close();
		
	}

}
