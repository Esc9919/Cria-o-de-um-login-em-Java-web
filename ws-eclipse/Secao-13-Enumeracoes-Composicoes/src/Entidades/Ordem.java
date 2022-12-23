package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidades.enums.OrdemStatusPedido;

public class Ordem {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private OrdemStatusPedido status;
	
	private Cliente cliente;
	
	private List<ItemOrdem> itens = new ArrayList<>();
	
	public Ordem() {
		
	}
	
	public Ordem(Date momento, OrdemStatusPedido status, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemStatusPedido getStatus() {
		return status;
	}
	
	public void setStatus(OrdemStatusPedido status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(ItemOrdem item) {
		itens.add(item);
	}
	
	public void removeItem(ItemOrdem item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for(ItemOrdem io : itens) {
			soma += io.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento da Ordem: "); 
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status da Ordem: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Item da Ordem:\n");
		for(ItemOrdem i : itens) {
			sb.append(i + "\n");
		}
		sb.append("Preco Total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
