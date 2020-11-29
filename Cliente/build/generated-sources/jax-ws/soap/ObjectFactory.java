
package soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
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

    private final static QName _DolarToReal_QNAME = new QName("http://soap/", "dolarToReal");
    private final static QName _DolarToRealResponse_QNAME = new QName("http://soap/", "dolarToRealResponse");
    private final static QName _EuroToReal_QNAME = new QName("http://soap/", "euroToReal");
    private final static QName _EuroToRealResponse_QNAME = new QName("http://soap/", "euroToRealResponse");
    private final static QName _LibraToReal_QNAME = new QName("http://soap/", "libraToReal");
    private final static QName _LibraToRealResponse_QNAME = new QName("http://soap/", "libraToRealResponse");
    private final static QName _RealToDolar_QNAME = new QName("http://soap/", "realToDolar");
    private final static QName _RealToDolarResponse_QNAME = new QName("http://soap/", "realToDolarResponse");
    private final static QName _RealToEuro_QNAME = new QName("http://soap/", "realToEuro");
    private final static QName _RealToEuroResponse_QNAME = new QName("http://soap/", "realToEuroResponse");
    private final static QName _RealToLibra_QNAME = new QName("http://soap/", "realToLibra");
    private final static QName _RealToLibraResponse_QNAME = new QName("http://soap/", "realToLibraResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DolarToReal }
     * 
     */
    public DolarToReal createDolarToReal() {
        return new DolarToReal();
    }

    /**
     * Create an instance of {@link DolarToRealResponse }
     * 
     */
    public DolarToRealResponse createDolarToRealResponse() {
        return new DolarToRealResponse();
    }

    /**
     * Create an instance of {@link EuroToReal }
     * 
     */
    public EuroToReal createEuroToReal() {
        return new EuroToReal();
    }

    /**
     * Create an instance of {@link EuroToRealResponse }
     * 
     */
    public EuroToRealResponse createEuroToRealResponse() {
        return new EuroToRealResponse();
    }

    /**
     * Create an instance of {@link LibraToReal }
     * 
     */
    public LibraToReal createLibraToReal() {
        return new LibraToReal();
    }

    /**
     * Create an instance of {@link LibraToRealResponse }
     * 
     */
    public LibraToRealResponse createLibraToRealResponse() {
        return new LibraToRealResponse();
    }

    /**
     * Create an instance of {@link RealToDolar }
     * 
     */
    public RealToDolar createRealToDolar() {
        return new RealToDolar();
    }

    /**
     * Create an instance of {@link RealToDolarResponse }
     * 
     */
    public RealToDolarResponse createRealToDolarResponse() {
        return new RealToDolarResponse();
    }

    /**
     * Create an instance of {@link RealToEuro }
     * 
     */
    public RealToEuro createRealToEuro() {
        return new RealToEuro();
    }

    /**
     * Create an instance of {@link RealToEuroResponse }
     * 
     */
    public RealToEuroResponse createRealToEuroResponse() {
        return new RealToEuroResponse();
    }

    /**
     * Create an instance of {@link RealToLibra }
     * 
     */
    public RealToLibra createRealToLibra() {
        return new RealToLibra();
    }

    /**
     * Create an instance of {@link RealToLibraResponse }
     * 
     */
    public RealToLibraResponse createRealToLibraResponse() {
        return new RealToLibraResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarToReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "dolarToReal")
    public JAXBElement<DolarToReal> createDolarToReal(DolarToReal value) {
        return new JAXBElement<DolarToReal>(_DolarToReal_QNAME, DolarToReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarToRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "dolarToRealResponse")
    public JAXBElement<DolarToRealResponse> createDolarToRealResponse(DolarToRealResponse value) {
        return new JAXBElement<DolarToRealResponse>(_DolarToRealResponse_QNAME, DolarToRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "euroToReal")
    public JAXBElement<EuroToReal> createEuroToReal(EuroToReal value) {
        return new JAXBElement<EuroToReal>(_EuroToReal_QNAME, EuroToReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "euroToRealResponse")
    public JAXBElement<EuroToRealResponse> createEuroToRealResponse(EuroToRealResponse value) {
        return new JAXBElement<EuroToRealResponse>(_EuroToRealResponse_QNAME, EuroToRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraToReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "libraToReal")
    public JAXBElement<LibraToReal> createLibraToReal(LibraToReal value) {
        return new JAXBElement<LibraToReal>(_LibraToReal_QNAME, LibraToReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraToRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "libraToRealResponse")
    public JAXBElement<LibraToRealResponse> createLibraToRealResponse(LibraToRealResponse value) {
        return new JAXBElement<LibraToRealResponse>(_LibraToRealResponse_QNAME, LibraToRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToDolar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "realToDolar")
    public JAXBElement<RealToDolar> createRealToDolar(RealToDolar value) {
        return new JAXBElement<RealToDolar>(_RealToDolar_QNAME, RealToDolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToDolarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "realToDolarResponse")
    public JAXBElement<RealToDolarResponse> createRealToDolarResponse(RealToDolarResponse value) {
        return new JAXBElement<RealToDolarResponse>(_RealToDolarResponse_QNAME, RealToDolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "realToEuro")
    public JAXBElement<RealToEuro> createRealToEuro(RealToEuro value) {
        return new JAXBElement<RealToEuro>(_RealToEuro_QNAME, RealToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "realToEuroResponse")
    public JAXBElement<RealToEuroResponse> createRealToEuroResponse(RealToEuroResponse value) {
        return new JAXBElement<RealToEuroResponse>(_RealToEuroResponse_QNAME, RealToEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToLibra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "realToLibra")
    public JAXBElement<RealToLibra> createRealToLibra(RealToLibra value) {
        return new JAXBElement<RealToLibra>(_RealToLibra_QNAME, RealToLibra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToLibraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap/", name = "realToLibraResponse")
    public JAXBElement<RealToLibraResponse> createRealToLibraResponse(RealToLibraResponse value) {
        return new JAXBElement<RealToLibraResponse>(_RealToLibraResponse_QNAME, RealToLibraResponse.class, null, value);
    }

}
