package br.com.fuctura.webservices.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "produto")
public class Produto {
	private long codigo;
	private String descricao;
	private double preco;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
}
