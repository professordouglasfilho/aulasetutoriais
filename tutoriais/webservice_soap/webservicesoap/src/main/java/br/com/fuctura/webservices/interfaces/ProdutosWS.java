package br.com.fuctura.webservices.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.fuctura.webservices.model.Produtos;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ProdutosWS {
	
	@WebMethod(operationName="listaProdutos")
	public Produtos listaProdutos();
}
