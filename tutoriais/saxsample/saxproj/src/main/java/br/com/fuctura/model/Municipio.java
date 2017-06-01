package br.com.fuctura.model;

/**
 * Classe reflexo do elemento &ltmunicipio&gt
 * @author douglas.f.filho
 *
 */
public class Municipio {
	private int id;
	private String nome;
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
