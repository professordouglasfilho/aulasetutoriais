package br.com.fuctura.controller;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fuctura.utils.Logs;
import br.com.fuctura.webservices.Municipios;
import br.com.fuctura.webservices.MunicipiosWS;

/**
 * Controlador das ações de todo o sistema.
 * Auxiliado por Spring para gerenciar o retorno das requisições por url
 * @author douglas.f.filho
 *
 */
@Controller
public class SiteController {
	
	@RequestMapping(value={"/","home"})
	public String home(Model model){
		return "index";
	}
	
	@RequestMapping("mostraBemVindo")
	public String mostraBemVindo(String nome, Model model){
		model.addAttribute("nome",nome);
		return "index";
	}
	
	@RequestMapping("listarMunicipios")
	public String listarMunicipios(Model model){
		try{
			URL wsdl = new URL("http://soap-sample.herokuapp.com/municipios?wsdl");
			QName implementacaoDoServicoRemoto = new QName("http://impl.webservices.fuctura.com.br/", "MunicipiosWSImplService");
			Service servicoGenerico = Service.create(wsdl, implementacaoDoServicoRemoto);
			MunicipiosWS portDoServicoRemoto = servicoGenerico.getPort(MunicipiosWS.class);
			Municipios municipios = portDoServicoRemoto.listar();
			model.addAttribute("listaDeMunicipios",municipios.getListaDeMunicipios().getMunicipio());
			return "municipios";
		}
		catch(Exception e){
			Logs.warn("[SiteController]::listarMunicipios::Erro tentando listar municipios remotamente. Exception:");
			e.printStackTrace();
			return "redirect:home";
		}
	}
	
}
