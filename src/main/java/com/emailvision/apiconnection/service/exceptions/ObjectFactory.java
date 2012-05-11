
package com.emailvision.apiconnection.service.exceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.emailvision.apimember.service.api.ConnectionExceptionDetails;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emailvision.apiconnection.service.exceptions package. 
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

    private final static QName _ConnectionServiceException_QNAME = new QName("http://exceptions.service.apiconnection.emailvision.com/", "ConnectionServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emailvision.apiconnection.service.exceptions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionExceptionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exceptions.service.apiconnection.emailvision.com/", name = "ConnectionServiceException")
    public JAXBElement<ConnectionExceptionDetails> createConnectionServiceException(ConnectionExceptionDetails value) {
        return new JAXBElement<ConnectionExceptionDetails>(_ConnectionServiceException_QNAME, ConnectionExceptionDetails.class, null, value);
    }

}
