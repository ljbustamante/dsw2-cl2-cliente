package soap.cliente.action;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import soap.cibertec.interfaces.Producto;
import soap.cibertec.servicio.ProductoService;
@ParentPackage("dawi")
public class ProductoAction extends ActionSupport{
	//
	public List<Producto> listaProductos;
	public Producto producto;
	private double minimo, maximo;
	
	//session
	private Map<String,Object> session=ActionContext.getContext().getSession();
	private ProductoService servicio;
	
	public ProductoAction() {
		servicio=new ProductoService();
	}
	
	@Action(value="/listarProductosRangoPrecio",results= {@Result(name="ok",type="json")})
	public String listarProductosRangoPrecio() {
		listaProductos=servicio.listarProductosRangoPrecio(minimo, maximo);
		return "ok";
	}
	@Action(value="/guardarProducto",results= {@Result(name="ok",location="/producto.jsp")})
	public String guardarProducto() {
		int salida;
		salida=servicio.guardarProducto(producto);
		if(salida!=-1)
			session.put("MENSAJE","Registro ok..");
		else
			session.put("MENSAJE","Error en el registro");
		return "ok";
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public double getMinimo() {
		return minimo;
	}

	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public void setMaximo(double maximo) {
		this.maximo = maximo;
	}
	
}






