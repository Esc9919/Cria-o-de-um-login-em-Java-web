package Entidades;

import java.util.Date;

import Entidades.enums.OrdemStatus;

public class Pedido {

	private Integer id;
	private Date momento;
	private OrdemStatus status;
	
	public Pedido() {
		
	}
	
	public Pedido(Integer id, Date momento,OrdemStatus status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
	
	
	
}
