package br.com.fuctura.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa o arquivo XML em si.
 * @author douglas.f.filho
 *
 */
public class Paises {
	private List<Pais> lista;
	
	public Paises(){
		lista = new ArrayList<Pais>();
	}

	public List<Pais> getLista() {
		return lista;
	}

	public void setPaises(List<Pais> lista) {
		this.lista = lista;
	}
	
	public void addPais(Pais pais){
		this.lista.add(pais);
	}
}
