package bestprice.libreria;

import java.util.List;

public class ProductoImpl implements Nombrable, Producto {

	private String nombre;
	private Marca marca;
	private int peso;
	private Long barras;
	private String categoria;
	private String descripcion;
	private String imagen;
	public List<Producto> similares;
	public List<ProductoComercio> comercios;

	
	
	public List<Producto> getSimilares() {
		return similares;
	}

	public void setSimilares(List<Producto> similares) {
		this.similares = similares;
	}

	public List<ProductoComercio> getComercios() {
		return comercios;
	}

	public void setComercios(List<ProductoComercio> comercios) {
		this.comercios = comercios;
	}

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
	public Long getBarras() {
		return barras;
	}

	public void setBarras(Long barras) {
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



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;
	}
	
	
	@Override
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "ProductoImpl [getSimilares()=" + getSimilares() + ", getComercios()=" + getComercios() + ", getMarca()="
				+ getMarca() + ", getPeso()=" + getPeso() + ", getBarras()=" + getBarras() + ", getCategoria()="
				+ getCategoria() + ", getDescripcion()=" + getDescripcion() + ", getNombre()=" + getNombre()
				+ ", getImagen()=" + getImagen() + "]";
	}



}

