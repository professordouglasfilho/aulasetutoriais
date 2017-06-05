package br.com.fuctura.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.fuctura.model.Municipio;
import br.com.fuctura.model.Municipios;

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
	
	/**
	 * Cria uma lista de municipios
	 * @return
	 */
	private Municipios geraMunicipios(){
		Municipios municipios = new Municipios();
		
		Municipio m1 = new Municipio();
		m1.setPosicao(1);
		m1.setNome("Recife");
		m1.setHabitantes("1625583");
		municipios.addMunicipio(m1);
		
		Municipio m2 = new Municipio();
		m2.setPosicao(2);
		m2.setNome("Jabotão dos Guararapes");
		m2.setHabitantes("691125");
		municipios.addMunicipio(m2);
		
		Municipio m3 = new Municipio();
		m3.setPosicao(3);
		m3.setNome("Olinda");
		m3.setHabitantes("390144");
		municipios.addMunicipio(m3);
		
		return municipios;
	}
	
	@RequestMapping("getMunicipios")
	public void getMunicipios(String token, HttpServletResponse response){
		try{
			if(token != null && token.equals("senha12345")){
				Municipios municipios = geraMunicipios();
				
				XStream xstream = new XStream(new DomDriver());
				
				@SuppressWarnings("rawtypes")
				Class[] types = new Class[2];
				types[0] = Municipio.class;
				types[1] = Municipios.class;
				
				xstream.processAnnotations(types);
				
				String xml = xstream.toXML(municipios);
				
				response.setCharacterEncoding("utf-8");
				response.setContentType("application/xml");
				response.getWriter().append(xml);
				response.getWriter().close();
			}
			else{
				response.sendError(400, "O serviço precisa de um token válido.");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Mostra a página consumer.jsp
	 * @return
	 */
	@RequestMapping("consumer")
	public String consumer(){
		return "consumer";
	}
	
}
