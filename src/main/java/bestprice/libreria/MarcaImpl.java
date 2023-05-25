package bestprice.libreria;

public abstract class MarcaImpl implements Nombrable, Marca{
	
	public String nombre;
	
	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public MarcaImpl() {
	}
	@Override
	public String toString() {
		return "MarcaImpl [getNombre()=" + getNombre() + "]";
	}



}
