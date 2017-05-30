package br.com.fuctura.model;

/**
 * Representa um objeto do arquivo.
 * @author douglas.f.filho
 *
 */
public class Pais {
	private String nome;
	private String sigla;
	
	public Pais(){
		nome = "";
		sigla = "";
	}
	
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