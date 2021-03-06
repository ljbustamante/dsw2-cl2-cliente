
package soap.cibertec.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import soap.cibertec.interfaces.ObjectFactory;
import soap.cibertec.interfaces.Producto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "servicio", targetNamespace = "http://interfaces.cibertec.soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicio {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "guardarProducto", targetNamespace = "http://interfaces.cibertec.soap/", className = "soap.cibertec.interfaces.GuardarProducto")
    @ResponseWrapper(localName = "guardarProductoResponse", targetNamespace = "http://interfaces.cibertec.soap/", className = "soap.cibertec.interfaces.GuardarProductoResponse")
    @Action(input = "http://interfaces.cibertec.soap/servicio/guardarProductoRequest", output = "http://interfaces.cibertec.soap/servicio/guardarProductoResponse")
    public int guardarProducto(
        @WebParam(name = "arg0", targetNamespace = "")
        Producto arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<soap.cibertec.interfaces.Producto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarProductosRangoPrecio", targetNamespace = "http://interfaces.cibertec.soap/", className = "soap.cibertec.interfaces.ListarProductosRangoPrecio")
    @ResponseWrapper(localName = "listarProductosRangoPrecioResponse", targetNamespace = "http://interfaces.cibertec.soap/", className = "soap.cibertec.interfaces.ListarProductosRangoPrecioResponse")
    @Action(input = "http://interfaces.cibertec.soap/servicio/listarProductosRangoPrecioRequest", output = "http://interfaces.cibertec.soap/servicio/listarProductosRangoPrecioResponse")
    public List<Producto> listarProductosRangoPrecio(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}
