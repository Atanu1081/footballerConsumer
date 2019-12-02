
package pojoClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Footballer" type="{https://www.howtodoinjava.com/xml/school}Footballer"/>
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
    "footballer"
})
@XmlRootElement(name = "FootballerDetailsResponse")
public class FootballerDetailsResponse {

    @XmlElement(name = "Footballer", required = true)
    protected Footballer footballer;

    /**
     * Gets the value of the footballer property.
     * 
     * @return
     *     possible object is
     *     {@link Footballer }
     *     
     */
    public Footballer getFootballer() {
        return footballer;
    }

    /**
     * Sets the value of the footballer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Footballer }
     *     
     */
    public void setFootballer(Footballer value) {
        this.footballer = value;
    }

}
