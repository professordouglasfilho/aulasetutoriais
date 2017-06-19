
package br.com.fuctura.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fuctura.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Municipio_QNAME = new QName("http://webservices.fuctura.com.br/", "municipio");
    private final static QName _Municipios_QNAME = new QName("http://webservices.fuctura.com.br/", "municipios");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fuctura.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Municipios }
     * 
     */
    public Municipios createMunicipios() {
        return new Municipios();
    }

    /**
     * Create an instance of {@link Municipio }
     * 
     */
    public Municipio createMunicipio() {
        return new Municipio();
    }

    /**
     * Create an instance of {@link Municipios.ListaDeMunicipios }
     * 
     */
    public Municipios.ListaDeMunicipios createMunicipiosListaDeMunicipios() {
        return new Municipios.ListaDeMunicipios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Municipio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.fuctura.com.br/", name = "municipio")
    public JAXBElement<Municipio> createMunicipio(Municipio value) {
        return new JAXBElement<Municipio>(_Municipio_QNAME, Municipio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Municipios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.fuctura.com.br/", name = "municipios")
    public JAXBElement<Municipios> createMunicipios(Municipios value) {
        return new JAXBElement<Municipios>(_Municipios_QNAME, Municipios.class, null, value);
    }

}
