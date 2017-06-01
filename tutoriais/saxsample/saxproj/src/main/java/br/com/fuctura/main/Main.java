package br.com.fuctura.main;

import br.com.fuctura.handler.SAXHandler;
import br.com.fuctura.model.Municipio;
import br.com.fuctura.model.Municipios;

/**
 * Classe usada para executar a aplicação
 * @author douglas.f.filho
 *
 */
public class Main {

	public static void main(String[] args) {
		try{
			SAXHandler handler = new SAXHandler();
			handler.setLoggable(false);
			Municipios municipios = handler.parse("municipios.xml");
			for(Municipio m : municipios){
				System.out.println("Municipio:");
				System.out.println("->Id: "+m.getId());
				System.out.println("->Nome: "+m.getNome());
				System.out.println("->Habitantes: "+m.getHabitantes());
				System.out.println("");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
