package br.com.fuctura.webservices.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "br.com.fuctura.webservices.model")
public class Produtos {
	@XmlElementWrapper(name = "produtos")
	@XmlElement(name = "produto")
	private ArrayList<Produto> produtos;
	
	public Produtos(){
		this.produtos = new ArrayList<Produto>();
	}
	
	public ArrayList<Produto> getProdutos(){
		return this.produtos;
	}
	
	public void add(Produto produto){
		this.produtos.add(produto);
	}
}
