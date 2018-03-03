package br.com.fiap.bean;

public class Produto {

	private int cdProduto;
	private String dsProduto;
	private String nmCategoria;
	private double valor;

	
	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Produto(){
		
	}
	
	public Produto(int cdProduto, String dsProduto, String nmCategoria , double valor) {
		
		setCdProduto(cdProduto);
		setDsProduto(dsProduto);
		setNmCategoria(nmCategoria);
		setValor(valor);
		
	}



	public int getCdProduto() {
		return cdProduto;
	}
	public void setCdProduto(int cdProduto) {
		this.cdProduto = cdProduto;
	}
	public String getDsProduto() {
		return dsProduto;
	}
	public void setDsProduto(String dsProduto) {
		this.dsProduto = dsProduto;
	}
	public String getNmCategoria() {
		return nmCategoria;
	}
	public void setNmCategoria(String nmCategoria) {
		this.nmCategoria = nmCategoria;
	}
	
	
	
	
}
