package bestprice.libreria;

public class OnlineImpl extends ComercioImpl implements Online {
	@Override
	public TipoComercio getTipo() {
		return TipoComercio.Online;
	}
	
	private float envio;
	private float minimo;
	private float gastoCliente;
	
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
		
	
	public float getGastoCliente() {
		return gastoCliente;
	}
	public void setGastoCliente(float gastoCliente) {
		this.gastoCliente = gastoCliente;
	}
	@Override
	public String toString() {
		return super.toString()+"OnlineImpl [getTipoComercio()=" + getTipo() + ", getEnvio()=" + getEnvio() + ", getMinimo()="
				+ getMinimo() + "getGastoCliente()="+getGastoCliente()+ "]";
	}
	
	


}
