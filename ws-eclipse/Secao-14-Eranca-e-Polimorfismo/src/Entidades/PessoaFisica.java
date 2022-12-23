package Entidades;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double taxa() {
		if (getRendaAnual() < 20000.00) {
			return (getRendaAnual() * 0.15) - (this.getGastosSaude() * 0.50);
		} else {
			return (getRendaAnual() * 0.25)  - (this.getGastosSaude() * 0.50);
		}
	}
	
}
