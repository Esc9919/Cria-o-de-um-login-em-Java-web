package Modelo.Sevicos;

public class ServicoDeJurosAmericano implements ServicoDeJuros {

	private Double taxaDeJuros;

	public ServicoDeJurosAmericano(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	@Override
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}
	
}
