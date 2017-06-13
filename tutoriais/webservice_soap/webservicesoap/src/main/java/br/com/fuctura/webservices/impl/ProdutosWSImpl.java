package br.com.fuctura.webservices.impl;

import javax.jws.WebService;

import br.com.fuctura.webservices.interfaces.ProdutosWS;
import br.com.fuctura.webservices.model.Produto;
import br.com.fuctura.webservices.model.Produtos;

@WebService(endpointInterface="br.com.fuctura.webservices.interfaces.ProdutosWS")
public class ProdutosWSImpl implements ProdutosWS{

	@Override
	public Produtos listaProdutos() {
		Produtos produtos = new Produtos();
		
		Produto p1 = new Produto();
		p1.setCodigo(1);
		p1.setDescricao("Bicicleta");
		p1.setPreco(570.00);
		produtos.add(p1);
		
		Produto p2 = new Produto();
		p2.setCodigo(2);
		p2.setDescricao("Carro");
		p2.setPreco(18570.00);
		produtos.add(p2);
		
		Produto p3 = new Produto();
		p3.setCodigo(3);
		p3.setDescricao("Pipa");
		p3.setPreco(10.00);
		produtos.add(p3);
		
		return produtos;
	}

}
