package bestprice.libreria;

import java.util.List;

public interface Producto {
	Marca getMarca();
	int getPeso();
	Long getBarras();
	String getCategoria();
	String getDescripcion();
	String getImagen();
	List<Producto> getSimilares();
	List<ProductoComercio> getComercios();
	String getNombre();
	
}
