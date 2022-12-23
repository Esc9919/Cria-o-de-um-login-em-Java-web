package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.ItemOrdem;
import Entidades.Ordem;
import Entidades.Produto;
import Entidades.enums.OrdemStatusPedido;

public class ExFixacaoPedido {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.println("Data de nascimento: ");
		Date nascimento = sdf.parse(sc.next()); 
		
		Cliente cliente = new Cliente(nome, email, nascimento);
		
		System.out.println("Entre com os dados da ordem:");
		System.out.print("Status: ");
		OrdemStatusPedido status = OrdemStatusPedido.valueOf(sc.next());
		
		Ordem ordem = new Ordem(new Date(), status, cliente);
		
		System.out.print("Quantos itens o pedido vai ter? ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Entre com os dados do #" + (i+1) + " item:");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String produtoNome = sc.nextLine();
			System.out.print("Preco do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto(produtoNome, precoProduto);
			
			ItemOrdem io = new ItemOrdem(quantidade, precoProduto, produto);
			
			ordem.addItem(io);
			
		}
		
		System.out.println();
		System.out.println(ordem);
		
		sc.close();

	}

}
