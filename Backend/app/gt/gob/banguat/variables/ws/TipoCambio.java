
package gt.gob.banguat.variables.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Tipo de cambio en moneda extranjera
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TipoCambio", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", wsdlLocation = "http://www.banguat.gob.gt/variables/ws/TipoCambio.asmx?wsdl")
public class TipoCambio
    extends Service
{

    private final static URL TIPOCAMBIO_WSDL_LOCATION;
    private final static WebServiceException TIPOCAMBIO_EXCEPTION;
    private final static QName TIPOCAMBIO_QNAME = new QName("http://www.banguat.gob.gt/variables/ws/", "TipoCambio");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.banguat.gob.gt/variables/ws/TipoCambio.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TIPOCAMBIO_WSDL_LOCATION = url;
        TIPOCAMBIO_EXCEPTION = e;
    }

    public TipoCambio() {
        super(__getWsdlLocation(), TIPOCAMBIO_QNAME);
    }

    public TipoCambio(WebServiceFeature... features) {
        super(__getWsdlLocation(), TIPOCAMBIO_QNAME);
    }

    public TipoCambio(URL wsdlLocation) {
        super(wsdlLocation, TIPOCAMBIO_QNAME);
    }

    public TipoCambio(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TIPOCAMBIO_QNAME);
    }

    public TipoCambio(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TipoCambio(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns TipoCambioSoap
     */
    @WebEndpoint(name = "TipoCambioSoap")
    public TipoCambioSoap getTipoCambioSoap() {
        return super.getPort(new QName("http://www.banguat.gob.gt/variables/ws/", "TipoCambioSoap"), TipoCambioSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TipoCambioSoap
     */
    @WebEndpoint(name = "TipoCambioSoap")
    public TipoCambioSoap getTipoCambioSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.banguat.gob.gt/variables/ws/", "TipoCambioSoap"), TipoCambioSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TIPOCAMBIO_EXCEPTION!= null) {
            throw TIPOCAMBIO_EXCEPTION;
        }
        return TIPOCAMBIO_WSDL_LOCATION;
    }

}
