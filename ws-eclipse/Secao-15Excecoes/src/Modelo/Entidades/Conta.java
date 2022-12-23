package Modelo.Entidades;

import Modelo.Excecoes.LimiteSaqueException;
import Modelo.Excecoes.SaldoException;

public class Conta {

	private Integer numero;
	private String cliente;
	private Double saldo;
	private Double limiteDeSaque;
	
	public Conta() {
	
	}

	public Conta(Integer numero, String cliente, Double saldo, Double limiteDeSaque) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void deposito(Double quantia) {
		saldo += quantia;
	}
	
	public void saque(Double quantia) {
		if (quantia > limiteDeSaque) {
			throw new LimiteSaqueException("Erro no saque: Limite de saque Excedido!");
		} if (quantia > saldo) {
			throw new SaldoException("Erro no saque: Saldo insufuciente!");
		}
		saldo -= quantia;
	}
	
}
