package bestprice.libreria;

public class ProductoComercioImpl implements ProductoComercio{
	

	private Producto producto;
	private Comercio comercio;
	private float precio;
	
	@Override
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	@Override
	public Comercio getComercio() {
		return comercio;
	}
	public void setComercio(Comercio comercio) {
		this.comercio = comercio;
	}
	
	@Override
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public ProductoComercioImpl() {

	}
	
	@Override
	public String toString() {
		return "ProductoComercioImpl [getProducto()=" + getProducto() + ", getComercio()=" + getComercio()
				+ ", getPrecio()=" + getPrecio() + "]";
	}
	
	
	

}
