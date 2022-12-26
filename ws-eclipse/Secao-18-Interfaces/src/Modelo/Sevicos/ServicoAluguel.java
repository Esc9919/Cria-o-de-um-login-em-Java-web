package Modelo.Sevicos;

import java.time.Duration;

import Modelo.Entidades.AluguelDoCarro;
import Modelo.Entidades.Fatura;

public class ServicoAluguel {

	private Double precoPorHora;
	private Double precoPorDia;
	
	private ServicoDeImposto impostoBrasileiro;

	public ServicoAluguel(Double precoPorHora, Double precoPorDia, ServicoDeImposto impostoBrasileiro) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.impostoBrasileiro = impostoBrasileiro;
	}

	public void processoDeFatura(AluguelDoCarro aluguel) {
		
		double minutos = Duration.between(aluguel.getInicio(), aluguel.getFim()).toMinutes();
		double horas = minutos / 60.0;
		
		double pagamentoBasico;
		if (horas <= 12.0) {
			pagamentoBasico = precoPorHora * Math.ceil(horas);
		} else {
			pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
		}
		
		double imposto = impostoBrasileiro.imposto(pagamentoBasico);
			
		
		aluguel.setFatura(new Fatura(pagamentoBasico, imposto));
	}
	
}
