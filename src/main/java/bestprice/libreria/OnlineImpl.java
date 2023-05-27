package bestprice.libreria;

public class OnlineImpl extends ComercioImpl implements Online {
	
	public TipoComercio getTipoComercio() {
		return TipoComercio.Online;
	}
	
	private float envio;
	private float minimo;
	
	@Override
	public float getEnvio() {
		return envio;
	}
	public void setEnvio(float envio) {
		this.envio = envio;
	}
	@Override
	public float getMinimo() {
		return minimo;
	}
	public void setMinimo(float minimo) {
		this.minimo = minimo;
	}
	@Override
	public String toString() {
		return super.toString()+"OnlineImpl [getTipoComercio()=" + getTipoComercio() + ", getEnvio()=" + getEnvio() + ", getMinimo()="
				+ getMinimo() + "]";
	}
	
	


}
