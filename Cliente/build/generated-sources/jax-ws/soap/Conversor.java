
package soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Conversor", targetNamespace = "http://soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Conversor {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "euroToReal", targetNamespace = "http://soap/", className = "soap.EuroToReal")
    @ResponseWrapper(localName = "euroToRealResponse", targetNamespace = "http://soap/", className = "soap.EuroToRealResponse")
    @Action(input = "http://soap/Conversor/euroToRealRequest", output = "http://soap/Conversor/euroToRealResponse")
    public double euroToReal(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "libraToReal", targetNamespace = "http://soap/", className = "soap.LibraToReal")
    @ResponseWrapper(localName = "libraToRealResponse", targetNamespace = "http://soap/", className = "soap.LibraToRealResponse")
    @Action(input = "http://soap/Conversor/libraToRealRequest", output = "http://soap/Conversor/libraToRealResponse")
    public double libraToReal(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "realToEuro", targetNamespace = "http://soap/", className = "soap.RealToEuro")
    @ResponseWrapper(localName = "realToEuroResponse", targetNamespace = "http://soap/", className = "soap.RealToEuroResponse")
    @Action(input = "http://soap/Conversor/realToEuroRequest", output = "http://soap/Conversor/realToEuroResponse")
    public double realToEuro(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "realToDolar", targetNamespace = "http://soap/", className = "soap.RealToDolar")
    @ResponseWrapper(localName = "realToDolarResponse", targetNamespace = "http://soap/", className = "soap.RealToDolarResponse")
    @Action(input = "http://soap/Conversor/realToDolarRequest", output = "http://soap/Conversor/realToDolarResponse")
    public double realToDolar(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "realToLibra", targetNamespace = "http://soap/", className = "soap.RealToLibra")
    @ResponseWrapper(localName = "realToLibraResponse", targetNamespace = "http://soap/", className = "soap.RealToLibraResponse")
    @Action(input = "http://soap/Conversor/realToLibraRequest", output = "http://soap/Conversor/realToLibraResponse")
    public double realToLibra(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dolarToReal", targetNamespace = "http://soap/", className = "soap.DolarToReal")
    @ResponseWrapper(localName = "dolarToRealResponse", targetNamespace = "http://soap/", className = "soap.DolarToRealResponse")
    @Action(input = "http://soap/Conversor/dolarToRealRequest", output = "http://soap/Conversor/dolarToRealResponse")
    public double dolarToReal(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

}