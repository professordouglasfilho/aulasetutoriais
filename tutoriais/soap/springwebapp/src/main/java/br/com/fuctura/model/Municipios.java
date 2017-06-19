package br.com.fuctura.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("municipios")
@XmlRootElement
public class Municipios {
	@XStreamImplicit
	@XmlElementWrapper(name = "listaDeMunicipios")
	@XmlElement(name = "municipio")
	private List<Municipio> municipios;
	
	public Municipios(){
		this.municipios = new ArrayList<Municipio>();
	}
	
	public void addMunicipio(Municipio municipio){
		this.municipios.add(municipio);
	}
	
	public List<Municipio> getMunicipios(){
		return this.municipios;
	}
}
