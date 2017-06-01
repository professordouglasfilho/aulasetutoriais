package br.com.fuctura.handler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import br.com.fuctura.model.Municipio;
import br.com.fuctura.model.Municipios;

/**
 * Manipulador de XML baseado em SAX
 * @author douglas.f.filho
 *
 */
public class SAXHandler extends DefaultHandler{
	private Municipios municipios;//Representa a lista de municipios
	private Municipio municipio;//Representa um item da lista de municipios (usado durante a leitura do arquivo)
	
	private String tagAtual;//Contem o nome (qName) da tag que está sendo lida
	
	/**
	 * Construtor principal do handler
	 */
	public SAXHandler(){
		municipios = new Municipios();//Inicia a lista
		municipio = null;//Define como nulo para receber instancia somente durante a leitura
		tagAtual = "";//String em branco, espera para receber a tag em "startElement"
	}
	
	private boolean isLoggable = false;//Usado para informar procedimentos no console durante a execução da leitura.
	/**
	 * Método para ligar ou desligar informações do precesso de leitura no console.
	 * @param status
	 */
	public void setLoggable(boolean status){
		this.isLoggable = status;
	}
	/**
	 * Verifica se está configurado para escrever informações do precesso de leitura do arquivo no console.
	 * @return
	 */
	public boolean isLoggable(){
		return isLoggable;
	}
	
	private long time = 0;//Variável usada para calcular o tempo usado para realizar a leitura
	
	/**
	 * Método chamado no momento que a SAX lê a primeira linha do arquivo.
	 */
	@Override
	public void startDocument() throws SAXException{
		if(isLoggable){
			System.out.println("*****Inicio da leitura*****");
			time = System.currentTimeMillis();
		}
	}
	
	/**
	 * Método chamado ao entrar em uma tag(elemento)
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
		if(isLoggable){
			System.out.println("****Entrou no elemento <"+qName+"> - nome local = "+localName+" - uri("+uri+")****");
			if(attributes != null){
				int attr_len = attributes.getLength();
				System.out.println("***Este elemento possui "+attr_len+" atributos.***");
				if(attr_len > 0){
					for(int i = 0;i < attr_len;i++){
						System.out.println("**Atributo "+i+": "+attributes.getQName(i)+" = "+attributes.getValue(i)+"**");
					}
				}
			}
		}
		
		tagAtual = qName;//Define qual tag está sendo lida
		if(tagAtual.equals("municipio")){
			municipio = new Municipio();
			int id = Integer.parseInt(attributes.getValue("id"));
			municipio.setId(id);
		}
	}
	
	/**
	 * Método chamado quando são lidos caracteres dentro de uma tag(elemento)
	 */
	@Override
	public void characters(char[] chars, int offset, int len) throws SAXException{
		String texto = new String(chars,offset,len);
		if(isLoggable){
			System.out.println("*Texto dentro do elemento: "+texto);
		}
		
		if(tagAtual.equals("nome")){
			municipio.setNome(texto);
		}
		else if(tagAtual.equals("habitantes")){
			long habitantes = Long.parseLong(texto);
			municipio.setHabitantes(habitantes);
		}
		
		tagAtual = "";
	}
	
	/**
	 * Metodo chamado ao sair de um elemento
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException{
		if(isLoggable){
			System.out.println("****Saiu do elemento <"+qName+"> - nome local = "+localName+" - uri("+uri+")****");
		}
		
		if(qName.equals("municipio")){
			municipios.add(municipio);
			municipio = null;
			tagAtual = "";
		}
	}
	
	/**
	 * Método chamado no momento que o arquivo chega ao fim.
	 */
	@Override
	public void endDocument() throws SAXException{
		if(isLoggable){
			long now = System.currentTimeMillis();
			long elapsedTime = now - time;
			System.out.println("*****Leitura realizada em "+elapsedTime+" milisegundos*****");
		}
	}
	
	/**
	 * Converte o arquivo passado por parametro em uma lista de municipios
	 * @param arquivo = String que contem o local e nome do arquivo (exemplo: C:\temp\arquivo.xml)
	 * @return = Lista de municipios (Municipios)
	 */
	public Municipios parse(String arquivo){
		try{
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			parser.parse(arquivo, this);
			return this.municipios;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
