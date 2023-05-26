package bestprice.libreria;

import java.util.List;

public interface Producto {
	public Marca getMarca();
	public int getPeso();
	public int getBarras();
	public String getCategoria();
	public String getDescripcion() ;
	public List<Producto> getSimilares();

	public String getNombre();
	
}
