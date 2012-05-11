
package com.emailvision.apibatchmember.service.exceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.emailvision.apibatchmember.service.exceptions package. 
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

    private final static QName _BatchMemberServiceException_QNAME = new QName("http://exceptions.service.apibatchmember.emailvision.com/", "BatchMemberServiceException");
    private final static QName _BatchMemberExceptionDetails_QNAME = new QName("http://exceptions.service.apibatchmember.emailvision.com/", "batchMemberExceptionDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.emailvision.apibatchmember.service.exceptions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchMemberExceptionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exceptions.service.apibatchmember.emailvision.com/", name = "BatchMemberServiceException")
    public JAXBElement<BatchMemberExceptionDetails> createBatchMemberServiceException(BatchMemberExceptionDetails value) {
        return new JAXBElement<BatchMemberExceptionDetails>(_BatchMemberServiceException_QNAME, BatchMemberExceptionDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchMemberExceptionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exceptions.service.apibatchmember.emailvision.com/", name = "batchMemberExceptionDetails")
    public JAXBElement<BatchMemberExceptionDetails> createBatchMemberExceptionDetails(BatchMemberExceptionDetails value) {
        return new JAXBElement<BatchMemberExceptionDetails>(_BatchMemberExceptionDetails_QNAME, BatchMemberExceptionDetails.class, null, value);
    }

}
