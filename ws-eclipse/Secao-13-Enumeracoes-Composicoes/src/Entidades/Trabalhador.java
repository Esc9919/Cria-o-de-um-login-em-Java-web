package Entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entidades.enums.TrabalhadorNivel;

public class Trabalhador {

	private String nome;
	private TrabalhadorNivel nivel;
	private Double salariobase;
	
	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}
	
	public Trabalhador(String nome, TrabalhadorNivel nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salariobase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TrabalhadorNivel getNivel() {
		return nivel;
	}

	public void setNivel(TrabalhadorNivel nivel) {
		this.nivel = nivel;
	}

	public Double getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(Double salariobase) {
		this.salariobase = salariobase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasContrato> getContratos() {
		return contratos;
	}

	public void addContratos(HorasContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(HorasContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double recebido(int ano, int mes) {
		double soma = salariobase;
		Calendar cal = Calendar.getInstance();
		for (HorasContrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
}
