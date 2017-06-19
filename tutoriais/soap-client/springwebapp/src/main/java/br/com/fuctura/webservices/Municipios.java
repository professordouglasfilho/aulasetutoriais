
package br.com.fuctura.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for municipios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="municipios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaDeMunicipios" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="municipio" type="{http://webservices.fuctura.com.br/}municipio" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "municipios", propOrder = {
    "listaDeMunicipios"
})
public class Municipios {

    protected Municipios.ListaDeMunicipios listaDeMunicipios;

    /**
     * Gets the value of the listaDeMunicipios property.
     * 
     * @return
     *     possible object is
     *     {@link Municipios.ListaDeMunicipios }
     *     
     */
    public Municipios.ListaDeMunicipios getListaDeMunicipios() {
        return listaDeMunicipios;
    }

    /**
     * Sets the value of the listaDeMunicipios property.
     * 
     * @param value
     *     allowed object is
     *     {@link Municipios.ListaDeMunicipios }
     *     
     */
    public void setListaDeMunicipios(Municipios.ListaDeMunicipios value) {
        this.listaDeMunicipios = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="municipio" type="{http://webservices.fuctura.com.br/}municipio" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "municipio"
    })
    public static class ListaDeMunicipios {

        protected List<Municipio> municipio;

        /**
         * Gets the value of the municipio property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the municipio property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMunicipio().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Municipio }
         * 
         * 
         */
        public List<Municipio> getMunicipio() {
            if (municipio == null) {
                municipio = new ArrayList<Municipio>();
            }
            return this.municipio;
        }

    }

}
