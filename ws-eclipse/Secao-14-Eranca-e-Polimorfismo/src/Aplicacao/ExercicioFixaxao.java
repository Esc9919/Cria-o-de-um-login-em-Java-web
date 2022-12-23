package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;
import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;

public class ExercicioFixaxao {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do #" + i + " produto:");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char ch = sc.next().charAt(0); 
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			if(ch == 'c') {
				Produto pro = new Produto(nome, preco);
				list.add(pro);
			} else if(ch == 'u') {
				System.out.print("Data de producao(DD/MM/YYYY): ");
				Date dataDeProducao = sdf.parse(sc.next());
				Produto pro = new ProdutoUsado(nome, preco, dataDeProducao);
				list.add(pro);
			} else {
				System.out.print("Preco da taxacao: ");
				double taxacao = sc.nextDouble();
				Produto pro = new ProdutoImportado(nome, preco, taxacao);
				list.add(pro);
			}
			
		}
		
		System.out.println();
		System.out.println("Etiquetas de preco:");
		for (Produto pro : list) {
			System.out.println(pro.etiqueta());
		}
		
		sc.close();
		
	}

}
