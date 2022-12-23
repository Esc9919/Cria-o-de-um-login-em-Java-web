import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		 
		Usuario usuario = new Usuario();

		System.out.println("Nome? ");
		String nome = x.next();
		usuario.setNome(nome);

		System.out.println("Sobrenome? ");
		String sobrenome = x.next();
		usuario.setSobrenome(sobrenome);

		System.out.println("idade? ");
		int idade = x.nextInt();
		usuario.setIdade(idade);

		System.out.println("CPF? ");
		String cpf = x.next();
		usuario.setCpf(cpf);

		System.out.println("Renda? ");
		double renda = x.nextDouble();
		usuario.setRenda(renda);

		System.out.printf("%s tem %d anos, do CPF %s e renda de R$%.2f\n", usuario.getNomeCompleto(),
				usuario.getIdade(), usuario.getCpf(), usuario.getRenda());

		String maiorDeIdade = (idade >= 18) ? " e maior de idade!" : " e menor de idade";
		
		System.out.println(maiorDeIdade);
		

		x.close();

	}

}
