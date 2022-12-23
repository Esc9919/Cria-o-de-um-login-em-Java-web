package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataDeProducao;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataDeProducao) {
		super(nome, preco);
		this.dataDeProducao = dataDeProducao;
	}

	public Date getDataDeProducao() {
		return dataDeProducao;
	}

	public void setDataDeProducao(Date dataDeProducao) {
		this.dataDeProducao = dataDeProducao;
	}
	
	@Override
	public String etiqueta() {
		return (nome + " (Usado) $ " + String.format("%.2f", preco) 
		+ " (Produzido data: " + sdf.format(dataDeProducao) + ")");
	}
	
}
