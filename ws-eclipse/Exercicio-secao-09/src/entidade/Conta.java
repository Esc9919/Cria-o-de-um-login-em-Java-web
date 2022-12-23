package entidade;

public class Conta {

	private int conta;
	private String nome;
	private double saldo;
	
	public Conta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
		
	}
	
	public Conta(int conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		deposita(depositoInicial);
	}
	
	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double deposita) {
		this.saldo += deposita;
	}
	
	public void saca(double saca) {
		saldo -= saca + 5.00;

	}
	
	public String toString() {
		return "Conta "
				+ conta
				+ ", Cliente "
				+ nome
				+ ", Saldo: R$"
				+ String.format("%.2f", saldo);
	}
	
	
	
	
}
