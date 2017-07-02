
package trng.loan.eligibility.service;

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
 *         &lt;element name="passengerProfileGetResponse" type="{http://www.example.org/LoanEligibilityService/}passengerProfileGetResponse"/>
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
    "passengerProfileGetResponse"
})
@XmlRootElement(name = "getPassengerProfileResponse")
public class GetPassengerProfileResponse {

    @XmlElement(required = true)
    protected PassengerProfileGetResponse passengerProfileGetResponse;

    /**
     * Gets the value of the passengerProfileGetResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerProfileGetResponse }
     *     
     */
    public PassengerProfileGetResponse getPassengerProfileGetResponse() {
        return passengerProfileGetResponse;
    }

    /**
     * Sets the value of the passengerProfileGetResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerProfileGetResponse }
     *     
     */
    public void setPassengerProfileGetResponse(PassengerProfileGetResponse value) {
        this.passengerProfileGetResponse = value;
    }

}
