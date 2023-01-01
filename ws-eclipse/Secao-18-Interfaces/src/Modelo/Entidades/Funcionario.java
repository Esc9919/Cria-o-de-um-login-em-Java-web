package Modelo.Entidades;

public class Funcionario implements Comparable<Funcionario> {

	private String nome;
	private Double salaior;
	
	public Funcionario(String nome, Double salaior) {
		this.nome = nome;
		this.salaior = salaior;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalaior() {
		return salaior;
	}

	public void setSalaior(Double salaior) {
		this.salaior = salaior;
	}

	@Override
	public int compareTo(Funcionario outro) {
		return nome.compareTo(outro.getNome());
	}
	
}
