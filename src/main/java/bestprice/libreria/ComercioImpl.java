package bestprice.libreria;

import java.util.Arrays;
import java.util.List;

public abstract class ComercioImpl implements Nombrable, Comercio {

private int codTienda;

public enum TipoComercio { 
	Presencial, 
	Online
}

private String nombre;

private int telefono;

private TipoComercio tipo;




private int[] codPostal;

private List<Producto> vendidos;

@Override
public int getCodTienda() {
	return codTienda;
}


public void setCodTienda(int codTienda) {
	this.codTienda = codTienda;
}
@Override
public List<Producto> getVendidos() {
	return vendidos;
}


public void setVendidos(List<Producto> vendidos) {
	this.vendidos = vendidos;
}

@Override
public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public TipoComercio getTipo() {
	return tipo;
}


public void setTipo(TipoComercio tipo) {
	this.tipo = tipo;
}


@Override
public int getTelefono() {
	return telefono;
}


public void setTelefono(int telefono) {
	this.telefono = telefono;
}

@Override
public int[] getCodPostal() {
	return codPostal;
}


public void setCodPostal(int[] codPostal) {
	this.codPostal = codPostal;
}


public ComercioImpl() {}


@Override
public String toString() {
	return "ComercioImpl [getCodTienda()=" + getCodTienda() + ", getVendidos()=" + getVendidos() + ", getNombre()="
			+ getNombre() + ", getTipo()=" + getTipo() + ", getTelefono()=" + getTelefono() + ", getCodPostal()="
			+ Arrays.toString(getCodPostal()) + "]";
}





}
