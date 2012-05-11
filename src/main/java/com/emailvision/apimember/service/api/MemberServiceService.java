
package com.emailvision.apimember.service.api;

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
@WebServiceClient(name = "MemberServiceService", targetNamespace = "http://api.service.apimember.emailvision.com/", wsdlLocation = "http://p5apic.emv2.com/apimember/services/MemberService?wsdl")
public class MemberServiceService
    extends Service
{

    private final static URL MEMBERSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.emailvision.apimember.service.api.MemberServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.emailvision.apimember.service.api.MemberServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://p5apic.emv2.com/apimember/services/MemberService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://p5apic.emv2.com/apimember/services/MemberService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        MEMBERSERVICESERVICE_WSDL_LOCATION = url;
    }

    public MemberServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MemberServiceService() {
        super(MEMBERSERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.apimember.emailvision.com/", "MemberServiceService"));
    }

    /**
     * 
     * @return
     *     returns MemberService
     */
    @WebEndpoint(name = "MemberServicePort")
    public MemberService getMemberServicePort() {
        return super.getPort(new QName("http://api.service.apimember.emailvision.com/", "MemberServicePort"), MemberService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MemberService
     */
    @WebEndpoint(name = "MemberServicePort")
    public MemberService getMemberServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.service.apimember.emailvision.com/", "MemberServicePort"), MemberService.class, features);
    }

}