package bestprice.libreria;

import java.util.List;

public interface Producto {
	Marca getMarca();
	int getPeso();
	Long getBarras();
	String getCategoria();
	String getDescripcion() ;
	List<Producto> getSimilares();
	List<ProductoComercio> getComercios();
	String getNombre();
	
}
