package br.com.fuctura.main;

import java.io.File;
import java.io.FileInputStream;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.fuctura.model.Pais;
import br.com.fuctura.model.Paises;

public class Main {
	public static void main(String[] args) {
		escrever();
		ler("paises.xml");
	}
	
	public static void escrever(){
		try{
			System.out.println("Escrevendo XML--------------------");
			Paises paises = new Paises();
			
			Pais brasil = new Pais();
			brasil.setNome("Brasil");
			brasil.setSigla("BR");
			paises.addPais(brasil);
			
			Pais us = new Pais();
			us.setNome("Estados Unidos");
			us.setSigla("US");
			paises.addPais(us);
			
			Pais fr = new Pais();
			fr.setNome("França");
			fr.setSigla("FR");
			paises.addPais(fr);
			
			XStream xstream = new XStream(new DomDriver());
			
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[2];
			types[0] = Pais.class;
			types[1] = Paises.class;
			
			xstream.processAnnotations(types);
			String xml = xstream.toXML(paises);
			
			System.out.println(xml);
			System.out.println("Fim da escrita-------------------");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void ler(String filePath){
		
		try{
			System.out.println("Iniciando leitura----------------");
			
			FileInputStream fis = new FileInputStream(new File(filePath));
			XStream xstream = new XStream(new DomDriver());
			
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[2];
			types[0] = Pais.class;
			types[1] = Paises.class;
			
			xstream.processAnnotations(types);
			
			Paises paises = (Paises)xstream.fromXML(fis);
			
			System.out.println("Paises:");
			
			for(Pais pais : paises.getPaises()){
				System.out.println("-->Nome: "+pais.getNome());
				System.out.println("-->Sigla: "+pais.getSigla());
				System.out.println("");
			}
			
			System.out.println("Fim da leitura-------------------");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
