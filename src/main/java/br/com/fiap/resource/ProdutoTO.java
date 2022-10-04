package br.com.fiap.resource;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProdutoTO {
	private int codigo;
	private String titulo;
	private double preco;
	private int quant;
	
	public ProdutoTO() {
		super();
	}
	
	public ProdutoTO(int codigo, String titulo, double preco, int quant) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
		this.quant = quant;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuant() {
		return quant;
	}
	
	public void setQuant(int quant) {
		this.quant = quant;
	}
}
