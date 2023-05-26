package bestprice.libreria;

import java.util.List;

public class ProductoImpl implements Nombrable, Producto {

	private String nombre;
	private Marca marca;
	private int peso;
	private int barras;
	private String categoria;
	private String descripcion;
	private List<ProductoComercio> similares;

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
	public List<ProductoComercio> getSimilares() {
		return similares;
	}

	public void setSimilares(List<ProductoComercio> similares) {
		this.similares = similares;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override	public String toString() {
		return "ProductoImpl [getMarca()=" + getMarca() + ", getPeso()=" + getPeso() + ", getBarras()=" + getBarras()
				+ ", getCategoria()=" + getCategoria() + ", getDescripcion()=" + getDescripcion() + ", getSimilares()="
				+ getSimilares() + ", getNombre()=" + getNombre() + "]";
	}

}

