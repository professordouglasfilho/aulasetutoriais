package br.com.fuctura.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("municipios")
public class Municipios{
	
	@XStreamImplicit
	List<Municipio> municipios;
	
	public Municipios(){
		municipios = new ArrayList<Municipio>();
	}
	
	public List<Municipio> getMunicipios(){
		return this.municipios;
	}
	
	public void addMunicipio(Municipio municipio){
		this.municipios.add(municipio);
	}
}
