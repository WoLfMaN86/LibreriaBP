package bestprice.libreria;

import java.util.List;

import bestprice.libreria.ComercioImpl.TipoComercio;

public interface Comercio {
	int getCodTienda();
	String getNombre();
	int getTelefono();
	int[] getCodPostal();
	TipoComercio getTipo();
	List<ProductoComercio> getVendidos();
	

}
