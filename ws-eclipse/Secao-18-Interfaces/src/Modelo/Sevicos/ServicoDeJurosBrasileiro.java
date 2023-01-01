package Modelo.Sevicos;

public class ServicoDeJurosBrasileiro implements ServicoDeJuros {

	private Double taxaDeJuros;

	public ServicoDeJurosBrasileiro(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	@Override
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}
	
}
