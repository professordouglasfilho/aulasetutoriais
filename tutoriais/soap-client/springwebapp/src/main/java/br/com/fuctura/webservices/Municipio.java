
package br.com.fuctura.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for municipio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="municipio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="posicao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habitantes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "municipio", propOrder = {
    "posicao",
    "nome",
    "habitantes"
})
public class Municipio {

    protected int posicao;
    protected String nome;
    protected String habitantes;

    /**
     * Gets the value of the posicao property.
     * 
     */
    public int getPosicao() {
        return posicao;
    }

    /**
     * Sets the value of the posicao property.
     * 
     */
    public void setPosicao(int value) {
        this.posicao = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the habitantes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabitantes() {
        return habitantes;
    }

    /**
     * Sets the value of the habitantes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabitantes(String value) {
        this.habitantes = value;
    }

}
