
package com.emailvision.apibatchmember.service.api;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BatchMemberServiceService", targetNamespace = "http://api.service.apibatchmember.emailvision.com/", wsdlLocation = "http://p5apic.emv2.com/apibatchmember/services/BatchMemberService?wsdl")
public class BatchMemberServiceService
    extends Service
{

    private final static URL BATCHMEMBERSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.emailvision.apibatchmember.service.api.BatchMemberServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.emailvision.apibatchmember.service.api.BatchMemberServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://p5apic.emv2.com/apibatchmember/services/BatchMemberService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://p5apic.emv2.com/apibatchmember/services/BatchMemberService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BATCHMEMBERSERVICESERVICE_WSDL_LOCATION = url;
    }

    public BatchMemberServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BatchMemberServiceService() {
        super(BATCHMEMBERSERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.apibatchmember.emailvision.com/", "BatchMemberServiceService"));
    }

    /**
     * 
     * @return
     *     returns BatchMemberService
     */
    @WebEndpoint(name = "BatchMemberServicePort")
    public BatchMemberService getBatchMemberServicePort() {
        return super.getPort(new QName("http://api.service.apibatchmember.emailvision.com/", "BatchMemberServicePort"), BatchMemberService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BatchMemberService
     */
    @WebEndpoint(name = "BatchMemberServicePort")
    public BatchMemberService getBatchMemberServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.service.apibatchmember.emailvision.com/", "BatchMemberServicePort"), BatchMemberService.class, features);
    }

}