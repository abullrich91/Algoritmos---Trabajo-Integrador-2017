package Helper;

public class Horario extends Sentido {
	private Integer velocidad;
	
	public Horario(Integer velocidad) {
		this.velocidad = velocidad;
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
