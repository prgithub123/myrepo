//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.27 at 10:54:10 AM CET 
//


package hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nighttime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Daytime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POP", propOrder = {
    "nighttime",
    "daytime"
})
public class POP {

    @XmlElement(name = "Nighttime")
    protected String nighttime;
    @XmlElement(name = "Daytime")
    protected String daytime;

    /**
     * Gets the value of the nighttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNighttime() {
        return nighttime;
    }

    /**
     * Sets the value of the nighttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNighttime(String value) {
        this.nighttime = value;
    }

    /**
     * Gets the value of the daytime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaytime() {
        return daytime;
    }

    /**
     * Sets the value of the daytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaytime(String value) {
        this.daytime = value;
    }

}
