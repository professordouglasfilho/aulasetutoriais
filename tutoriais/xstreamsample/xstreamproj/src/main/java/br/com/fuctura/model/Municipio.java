package br.com.fuctura.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Entidade municipio
 * @author douglas.f.filho
 *
 */
@XStreamAlias("municipio")
public class Municipio {
	@XStreamAlias("id")
	@XStreamAsAttribute
	private int id;
	@XStreamAlias("nome")
	private String nome;
	@XStreamAlias("habitantes")
	private long habitantes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(long habitantes) {
		this.habitantes = habitantes;
	}
	
	@Override
	public String toString() {
		return "Municipio [id=" + id + ", nome=" + nome + ", habitantes=" + habitantes + "]";
	}
}
