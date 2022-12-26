package Modelo.Sevicos;

public class ImpostoBrasileiro implements ServicoDeImposto {

	public double imposto(double quantia) {
		if (quantia <= 100.00) {
			return quantia * 0.2;
		} else {
			return quantia * 0.15;
		}
	}
	
}
