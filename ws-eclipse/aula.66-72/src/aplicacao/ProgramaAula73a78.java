package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class ProgramaAula73a78 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preco: ");
		double preco = sc.nextDouble();
		Produto produto = new Produto(nome, preco);
		
		produto.setNome("Computador");
		System.out.println("Alteracao no nome: " + produto.getNome());
		produto.setPreco(1200.00);
		System.out.println("Alteracao do preco: " + produto.getPreco());
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produtos para ser adicionado ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualizacao dos dados do produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com o numero de produtos para ser removido do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualizacao dos dados do produto: " + produto);
		
		sc.close();
		
	}

}
