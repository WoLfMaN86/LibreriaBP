package bestprice.libreria;

import java.util.List;

import bestprice.libreria.ComercioImpl.TipoComercio;

public interface Comercio {
	public int getCodTienda();
	public String getNombre();
	public int getTelefono();
	public int[] getCodPostal();
	public TipoComercio getTipo();
	public List<Producto> getVendidos();
	

}
