
public class Antihorario extends Sentido {
	private Integer velocidad;
	
	public Antihorario(Integer velocidad) {
		this.velocidad = -velocidad;
	}

	/**
	 * @return the velocidad
	 */
	@Override
	public Integer getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

}
