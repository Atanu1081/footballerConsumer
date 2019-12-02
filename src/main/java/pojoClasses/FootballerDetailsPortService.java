
package pojoClasses;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FootballerDetailsPortService", targetNamespace = "https://www.howtodoinjava.com/xml/school", wsdlLocation = "http://localhost:7111/service/footballerWSDl.wsdl")
public class FootballerDetailsPortService
    extends Service
{

    private final static URL FOOTBALLERDETAILSPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException FOOTBALLERDETAILSPORTSERVICE_EXCEPTION;
    private final static QName FOOTBALLERDETAILSPORTSERVICE_QNAME = new QName("https://www.howtodoinjava.com/xml/school", "FootballerDetailsPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7111/service/footballerWSDl.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FOOTBALLERDETAILSPORTSERVICE_WSDL_LOCATION = url;
        FOOTBALLERDETAILSPORTSERVICE_EXCEPTION = e;
    }

    public FootballerDetailsPortService() {
        super(__getWsdlLocation(), FOOTBALLERDETAILSPORTSERVICE_QNAME);
    }

    public FootballerDetailsPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FOOTBALLERDETAILSPORTSERVICE_QNAME, features);
    }

    public FootballerDetailsPortService(URL wsdlLocation) {
        super(wsdlLocation, FOOTBALLERDETAILSPORTSERVICE_QNAME);
    }

    public FootballerDetailsPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FOOTBALLERDETAILSPORTSERVICE_QNAME, features);
    }

    public FootballerDetailsPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FootballerDetailsPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FootballerDetailsPort
     */
    @WebEndpoint(name = "FootballerDetailsPortSoap11")
    public FootballerDetailsPort getFootballerDetailsPortSoap11() {
        return super.getPort(new QName("https://www.howtodoinjava.com/xml/school", "FootballerDetailsPortSoap11"), FootballerDetailsPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FootballerDetailsPort
     */
    @WebEndpoint(name = "FootballerDetailsPortSoap11")
    public FootballerDetailsPort getFootballerDetailsPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.howtodoinjava.com/xml/school", "FootballerDetailsPortSoap11"), FootballerDetailsPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FOOTBALLERDETAILSPORTSERVICE_EXCEPTION!= null) {
            throw FOOTBALLERDETAILSPORTSERVICE_EXCEPTION;
        }
        return FOOTBALLERDETAILSPORTSERVICE_WSDL_LOCATION;
    }

}