package entidade;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public double aumentoSalarial(double porcento){
		return salarioBruto += salarioBruto * porcento / 100;
	}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f", salarioLiquido());
	}
}
