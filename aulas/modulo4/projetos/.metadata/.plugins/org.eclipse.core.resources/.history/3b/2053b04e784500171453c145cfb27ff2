package br.com.fuctura.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * Classe modelo (representa o arquivo)
 * @author douglas.f.filho
 *
 */
@XStreamAlias("paises")
public class Paises {
	@XStreamImplicit
	List<Pais> paises;
	
	public Paises(){
		paises = new ArrayList<Pais>();
	}
	
	public void addPais(Pais pais){
		this.paises.add(pais);
	}
	
	public List<Pais> getPaises(){
		return this.paises;
	}
}
