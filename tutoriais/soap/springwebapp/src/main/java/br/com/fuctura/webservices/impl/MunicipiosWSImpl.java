package br.com.fuctura.webservices.impl;

import javax.jws.WebService;

import br.com.fuctura.controller.SiteController;
import br.com.fuctura.model.Municipios;
import br.com.fuctura.webservices.MunicipiosWS;

@WebService(endpointInterface = "br.com.fuctura.webservices.MunicipiosWS")
public class MunicipiosWSImpl implements MunicipiosWS{

	@Override
	public Municipios listar() {
		Municipios municipios = SiteController.geraMunicipios();
		return municipios;
	}
	
}
