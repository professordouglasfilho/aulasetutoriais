package br.com.fuctura.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Item da lista
 * @author douglas.f.filho
 *
 */
@XStreamAlias("pais")
public class Pais {
	@XStreamAlias("nome")
	private String nome;
	
	@XStreamAlias("sigla")
	@XStreamAsAttribute
	private String sigla;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}