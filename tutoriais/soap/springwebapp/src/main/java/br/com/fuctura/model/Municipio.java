package br.com.fuctura.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("municipio")
@XmlRootElement(name = "municipio")
@XmlAccessorType(XmlAccessType.FIELD)
public class Municipio {
	@XStreamAlias("posicao")
	private int posicao;
	@XStreamAlias("nome")
	private String nome;
	@XStreamAlias("habitantes")
	private String habitantes;
	
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(String habitantes) {
		this.habitantes = habitantes;
	}
	
	@Override
	public String toString() {
		return "Municipio [posicao=" + posicao + ", nome=" + nome + ", habitantes=" + habitantes + "]";
	}
}
