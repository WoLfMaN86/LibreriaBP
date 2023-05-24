package bestprice.libreria;

import java.util.List;

public class ProductoImpl extends ComercioImpl implements Nombrable, Producto {
	
	private String nombre;
	private Marca marca;
	private int peso;
	private int barras;
	private String categoria;
	private String descripcion;
	private List<Producto> similares;
	private List<Comercio> comercios;
	
	
	
	@Override
	public Marca getMarca() {
		return marca;
	}




	public void setMarca(Marca marca) {
		this.marca = marca;
	}



	@Override
	public int getPeso() {
		return peso;
	}




	public void setPeso(int peso) {
		this.peso = peso;
	}



	@Override
	public int getBarras() {
		return barras;
	}




	public void setBarras(int barras) {
		this.barras = barras;
	}



	@Override
	public String getCategoria() {
		return categoria;
	}




	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	@Override
	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	@Override
	public List<Producto> getSimilares() {
		return similares;
	}




	public void setSimilares(List<Producto> similares) {
		this.similares = similares;
	}



	@Override
	public List<Comercio> getComercios() {
		return comercios;
	}




	public void setComercios(List<Comercio> comercios) {
		this.comercios = comercios;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String getNombre() {
		return nombre;
	}




	public ProductoImpl(String nombre, Marca marca, int peso, int barras, String categoria, String descripcion,
			List<Producto> similares, List<Comercio> comercios) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.peso = peso;
		this.barras = barras;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.similares = similares;
		this.comercios = comercios;
	}




	@Override
	public String toString() {
		return "ProductoImpl [getMarca()=" + getMarca() + ", getPeso()=" + getPeso() + ", getBarras()=" + getBarras()
				+ ", getCategoria()=" + getCategoria() + ", getDescripcion()=" + getDescripcion() + ", getSimilares()="
				+ getSimilares() + ", getComercios()=" + getComercios() + ", getNombre()=" + getNombre() + "]";
	}






}
