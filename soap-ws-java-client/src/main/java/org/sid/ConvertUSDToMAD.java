
package org.sid;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Convert_USD_to_MAD complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="Convert_USD_to_MAD">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Convert_USD_to_MAD", propOrder = {
    "amount"
})
public class ConvertUSDToMAD {

    protected double amount;

    /**
     * Obtient la valeur de la propri�t� amount.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * D�finit la valeur de la propri�t� amount.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

}
