
package trng.loan.eligibility.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanEligibilityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanEligibilityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligibilityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eligibilityMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanEligibilityResponseType", propOrder = {
    "eligibilityCode",
    "eligibilityMessage"
})
public class LoanEligibilityResponseType {

    @XmlElement(required = true)
    protected String eligibilityCode;
    @XmlElement(required = true)
    protected String eligibilityMessage;

    /**
     * Gets the value of the eligibilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityCode() {
        return eligibilityCode;
    }

    /**
     * Sets the value of the eligibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityCode(String value) {
        this.eligibilityCode = value;
    }

    /**
     * Gets the value of the eligibilityMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityMessage() {
        return eligibilityMessage;
    }

    /**
     * Sets the value of the eligibilityMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityMessage(String value) {
        this.eligibilityMessage = value;
    }

}
