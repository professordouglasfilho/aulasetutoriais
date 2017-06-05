package br.com.fuctura.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("municipios")
public class Municipios {
	@XStreamImplicit
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
