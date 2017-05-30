package br.com.fuctura.main;

import br.com.fuctura.handler.PaisesSAXHandler;
import br.com.fuctura.model.Paises;
import br.com.fuctura.model.Pais;

/**
 * A classe que executa o c�digo.
 * @author douglas.f.filho
 *
 */
public class Main {
	/**
	 * M�todo usado para ler um arquivo XML e converter o mesmo.
	 * @param args
	 */
	public static void main(String[] args) {
		PaisesSAXHandler handler = new PaisesSAXHandler();
		String filePath = "paises.xml";
		Paises paises = handler.parse(filePath);
		for(Pais pais : paises.getLista()){
			System.out.println("Pa�s: ");
			System.out.println("-->Sigla: "+pais.getSigla());
			System.out.println("-->Nome: "+pais.getNome());
			System.out.println("");
		}
	}
}
