
package com.emailvision.apiccmd.service.exceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.emailvision.apiccmd.service.api.CcmdExceptionDetails;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emailvision.apiccmd.service.exceptions package. 
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

    private final static QName _CcmdServiceException_QNAME = new QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emailvision.apiccmd.service.exceptions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CcmdExceptionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exceptions.service.apiccmd.emailvision.com/", name = "CcmdServiceException")
    public JAXBElement<CcmdExceptionDetails> createCcmdServiceException(CcmdExceptionDetails value) {
        return new JAXBElement<CcmdExceptionDetails>(_CcmdServiceException_QNAME, CcmdExceptionDetails.class, null, value);
    }

}
