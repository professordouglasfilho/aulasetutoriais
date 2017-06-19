package br.com.fuctura.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import br.com.fuctura.model.Municipios;

@WebService
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public interface MunicipiosWS {
	
	@WebMethod(operationName = "listar")
	public Municipios listar();
}
