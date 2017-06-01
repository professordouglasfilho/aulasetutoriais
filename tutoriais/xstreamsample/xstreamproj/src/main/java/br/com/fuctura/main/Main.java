package br.com.fuctura.main;

import java.io.File;
import java.io.FileInputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import br.com.fuctura.model.Municipio;
import br.com.fuctura.model.Municipios;

/**
 * Classe principal (executa o projeto)
 * @author douglas.f.filho
 *
 */
public class Main {

	public static void main(String[] args) {
		try{
			Municipios municipios = lerXML("municipios.xml");
			for(Municipio m : municipios.getMunicipios()){
				System.out.println("Municipio:");
				System.out.println("->Id: "+m.getId());
				System.out.println("->Nome: "+m.getNome());
				System.out.println("->Habitantes: "+m.getHabitantes());
				System.out.println("");
			}
			
			String xml = escreverXML();
			System.out.println("\nArquivo gerado dinamicamente");
			System.out.println(xml);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Método para ler um arquivo XML
	 * @param arquivo
	 * @throws Exception
	 */
	private static Municipios lerXML(String arquivo) throws Exception{
		File file = new File(arquivo);
		FileInputStream fis = new FileInputStream(file);
		
		XStream xstream = new XStream(new DomDriver());
		XStream.setupDefaultSecurity(xstream);
		xstream.addPermission(AnyTypePermission.ANY);
		
		@SuppressWarnings("rawtypes")
		Class[] types = new Class[2];
		types[0] = Municipio.class;
		types[1] = Municipios.class;
		xstream.processAnnotations(types);
		
		Municipios municipios = (Municipios) xstream.fromXML(fis);
		
		return municipios;
	}
	
	private static String escreverXML() throws Exception{
		Municipios municipios = new Municipios();
		
		Municipio m1 = new Municipio();
		m1.setId(1);
		m1.setNome("Recife");
		m1.setHabitantes(1625583);
		municipios.addMunicipio(m1);
		
		Municipio m2 = new Municipio();
		m2.setId(2);
		m2.setNome("Jaboatão dos Guararapes");
		m2.setHabitantes(691125);
		municipios.addMunicipio(m2);
		
		Municipio m3 = new Municipio();
		m3.setId(3);
		m3.setNome("Olinda");
		m3.setHabitantes(390144);
		municipios.addMunicipio(m3);
		
		XStream xstream = new XStream(new DomDriver());
		
		@SuppressWarnings("rawtypes")
		Class[] types = new Class[2];
		types[0] = Municipio.class;
		types[1] = Municipios.class;
		xstream.processAnnotations(types);
		
		String xml = xstream.toXML(municipios);
		
		return xml;
	}
	
}
