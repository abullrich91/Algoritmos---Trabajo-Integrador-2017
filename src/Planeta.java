import java.util.List;

public class Planeta extends SistemaSolar implements MovimientosCosmicos {
	private String nombre;
	private Sentido sentido;
	private Integer distancia;
	private Coordenadas coordenadas;
	
	Planeta(String nombre, Sentido sentido, Integer distancia) {
		this.nombre = nombre;
		this.sentido = sentido;
		this.distancia = distancia;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the sentido
	 */
	public Sentido getSentido() {
		return sentido;
	}
	
	/**
	 * @param sentido the sentido to set
	 */
	public void setSentido(Sentido sentido) {
		this.sentido = sentido;
	}
	
	/**
	 * @return the distancia
	 */
	public Integer getDistancia() {
		return distancia;
	}
	
	/**
	 * @param distancia the distancia to set
	 */
	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}

	/**
	 * @return the coordenadas
	 */
	public Coordenadas getCoordenadas() {
		return coordenadas;
	}

	/**
	 * @param coordenadas the coordenadas to set
	 */
	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	@Override
	public void rotate(Sentido sentido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean arePlanetsAlignedWithSun(List<Planeta> planeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean arePlanetsAlignedWithEachOther(List<Planeta> planeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coordenadas getCoordenadas(Planeta planeta, Integer dias) {
		// TODO Auto-generated method stub
		return null;
	}

}
