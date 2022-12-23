package Entidades;

public class ContaCorporativa extends Conta {

	private Double limiteDeEmprestimo;
	
	public ContaCorporativa() {
		super();
	}

	public ContaCorporativa(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void emprestimo(double quantia) {
		if (quantia <= limiteDeEmprestimo) {
			saldo += quantia - 10.00;
		}
	}
	
	@Override
	public final void saque(double quantia) {
		super.saque(quantia);
		saldo -= 2.00;
	}
	
}
