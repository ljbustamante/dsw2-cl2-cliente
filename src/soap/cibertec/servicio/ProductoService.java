package soap.cibertec.servicio;

import java.util.List;

import soap.cibertec.interfaces.Producto;

public class ProductoService {
	private ProductoServiceImplService ws=null;

	public List<Producto> listarProductosRangoPrecio(double minimo, double maximo){
		List<Producto> lista=null;
		try {
			ws=new ProductoServiceImplService();
			Servicio soap=ws.getServicioProductoPort();
			lista=soap.listarProductosRangoPrecio(minimo, maximo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	public int guardarProducto(Producto bean) {
		int salida=-1;
		try {
			ws=new ProductoServiceImplService();
			Servicio soap=ws.getServicioProductoPort();
			salida=soap.guardarProducto(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salida;
	}
	


}






