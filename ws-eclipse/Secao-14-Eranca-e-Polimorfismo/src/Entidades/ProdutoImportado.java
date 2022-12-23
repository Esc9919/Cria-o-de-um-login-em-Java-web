package Entidades;

public final class ProdutoImportado extends Produto {

	private Double taxacao;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxacao) {
		super(nome, preco);
		this.taxacao = taxacao;
	}

	public Double getTaxacao() {
		return taxacao;
	}

	public void setTaxacao(Double taxacao) {
		this.taxacao = taxacao;
	}
	
	public Double precoTotal() {
		return preco + taxacao;
	}
	
	@Override
	public String etiqueta() {
		return (nome + " $ " + String.format("%.2f", precoTotal()) 
		+ " (Taxacao: $ " + String.format("%.2f", taxacao) + ")");
	}
	
}
