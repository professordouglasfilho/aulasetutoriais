package br.com.fuctura.handler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import br.com.fuctura.model.Paises;
import br.com.fuctura.model.Pais;

/**
 * Manipulador de eventos em arquivo XML
 * @author douglas.f.filho
 *
 */
public class PaisesSAXHandler extends DefaultHandler {
	private Paises paises;
	private Pais pais;
	String tagAtual = "";
	
	public PaisesSAXHandler(){
		super();
		paises = new Paises();
	}
	
	/**
	 * Metodo chamado ao iniciar a leitura do arquivo.
	 */
	@Override
	public void startDocument(){
//		Inicio da leitura.
	}
	
	/**
	 * Metodo chamado ao concluir a leitura do arquivo.
	 */
	@Override
	public void endDocument(){
//		Fim da leitura.
	}
	
	/**
	 * Metodo chamado ao entrar em uma tag.
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts){
		tagAtual = qName;
		
		if(qName.equals("pais")){
			pais = new Pais();
			pais.setSigla(atts.getValue("sigla"));
		}
	}
	
	/**
	 * Metodo usado para ler o conteudo da tag, isto e, seu texto
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException{
		String texto = new String(ch, start, length);
		
		if(tagAtual.equals("nome")){
			pais.setNome(texto);
		}
	}
	
	/**
	 * Metodo para indicar fim de leitura de elemento
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException{
		if(pais != null && !pais.getNome().equals("") && !pais.getSigla().equals("")){
			paises.addPais(pais);
			pais = null;
		}
		tagAtual = "";
	}
	
	/**
	 * Recebe o caminho do arquivo para converte-lo
	 * @param filePath
	 * @return
	 */
	public Paises parse(String filePath){
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser;

		try {
			saxParser = factory.newSAXParser();

			saxParser.parse(filePath, this);
			
			return this.paises;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
