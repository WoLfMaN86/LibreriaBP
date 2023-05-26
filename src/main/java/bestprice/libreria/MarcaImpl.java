package bestprice.libreria;

import java.util.List;

public abstract class MarcaImpl implements Nombrable, Marca{
	
	public String nombre;
	public List<Producto> productos;	
	


	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public MarcaImpl() {
	}

	@Override
	public String toString() {
		return "MarcaImpl [getProductos()=" + getProductos() + ", getNombre()=" + getNombre() + "]";
	}


	
	

//Test

}
