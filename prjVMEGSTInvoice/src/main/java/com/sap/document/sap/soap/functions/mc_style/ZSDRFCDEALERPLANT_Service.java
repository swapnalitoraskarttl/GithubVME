package com.sap.document.sap.soap.functions.mc_style;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-01-06T16:13:46.697+05:30
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "ZSDRFC_DEALER_PLANT",
                  wsdlLocation = "file:/C:/Users/swapnalitoraskar.ttl/Documents/My%20Received%20Files/prjVMEGSTInvoice/src/main/resources/SAPVMEGSTInvoice.wsdl",
                  targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style")
public class ZSDRFCDEALERPLANT_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZSDRFC_DEALER_PLANT");
    public final static QName ZSDRFCDEALERPLANT = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZSDRFC_DEALER_PLANT");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/swapnalitoraskar.ttl/Documents/My%20Received%20Files/prjVMEGSTInvoice/src/main/resources/SAPVMEGSTInvoice.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ZSDRFCDEALERPLANT_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/swapnalitoraskar.ttl/Documents/My%20Received%20Files/prjVMEGSTInvoice/src/main/resources/SAPVMEGSTInvoice.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ZSDRFCDEALERPLANT_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ZSDRFCDEALERPLANT_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZSDRFCDEALERPLANT_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ZSDRFCDEALERPLANT_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ZSDRFCDEALERPLANT_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ZSDRFCDEALERPLANT_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ZSDRFCDEALERPLANT
     */
    @WebEndpoint(name = "ZSDRFC_DEALER_PLANT")
    public ZSDRFCDEALERPLANT getZSDRFCDEALERPLANT() {
        return super.getPort(ZSDRFCDEALERPLANT, ZSDRFCDEALERPLANT.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZSDRFCDEALERPLANT
     */
    @WebEndpoint(name = "ZSDRFC_DEALER_PLANT")
    public ZSDRFCDEALERPLANT getZSDRFCDEALERPLANT(WebServiceFeature... features) {
        return super.getPort(ZSDRFCDEALERPLANT, ZSDRFCDEALERPLANT.class, features);
    }

}