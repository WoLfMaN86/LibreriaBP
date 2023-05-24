package bestprice.libreria;

public class PresencialImpl extends ComercioImpl implements Presencial {
	
	private String direccion;

	public TipoComercio getTipoComercio() {
		return TipoComercio.Presencial;
	}
	@Override
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return super.toString()+"PresencialImpl [getTipoComercio()=" + getTipoComercio() + ", getDireccion()=" + getDireccion() + "]";
	}
	
	

}
