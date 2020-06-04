
package soap.cibertec.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.cibertec.interfaces package. 
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

    private final static QName _GuardarProducto_QNAME = new QName("http://interfaces.cibertec.soap/", "guardarProducto");
    private final static QName _GuardarProductoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "guardarProductoResponse");
    private final static QName _ListarProductosRangoPrecio_QNAME = new QName("http://interfaces.cibertec.soap/", "listarProductosRangoPrecio");
    private final static QName _ListarProductosRangoPrecioResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listarProductosRangoPrecioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.cibertec.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarProductosRangoPrecioResponse }
     * 
     */
    public ListarProductosRangoPrecioResponse createListarProductosRangoPrecioResponse() {
        return new ListarProductosRangoPrecioResponse();
    }

    /**
     * Create an instance of {@link GuardarProducto }
     * 
     */
    public GuardarProducto createGuardarProducto() {
        return new GuardarProducto();
    }

    /**
     * Create an instance of {@link GuardarProductoResponse }
     * 
     */
    public GuardarProductoResponse createGuardarProductoResponse() {
        return new GuardarProductoResponse();
    }

    /**
     * Create an instance of {@link ListarProductosRangoPrecio }
     * 
     */
    public ListarProductosRangoPrecio createListarProductosRangoPrecio() {
        return new ListarProductosRangoPrecio();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "guardarProducto")
    public JAXBElement<GuardarProducto> createGuardarProducto(GuardarProducto value) {
        return new JAXBElement<GuardarProducto>(_GuardarProducto_QNAME, GuardarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "guardarProductoResponse")
    public JAXBElement<GuardarProductoResponse> createGuardarProductoResponse(GuardarProductoResponse value) {
        return new JAXBElement<GuardarProductoResponse>(_GuardarProductoResponse_QNAME, GuardarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProductosRangoPrecio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listarProductosRangoPrecio")
    public JAXBElement<ListarProductosRangoPrecio> createListarProductosRangoPrecio(ListarProductosRangoPrecio value) {
        return new JAXBElement<ListarProductosRangoPrecio>(_ListarProductosRangoPrecio_QNAME, ListarProductosRangoPrecio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProductosRangoPrecioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listarProductosRangoPrecioResponse")
    public JAXBElement<ListarProductosRangoPrecioResponse> createListarProductosRangoPrecioResponse(ListarProductosRangoPrecioResponse value) {
        return new JAXBElement<ListarProductosRangoPrecioResponse>(_ListarProductosRangoPrecioResponse_QNAME, ListarProductosRangoPrecioResponse.class, null, value);
    }

}
