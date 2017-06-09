
public class Sol extends SistemaSolar {
	private Coordenadas coordenadas = new Coordenadas(0, 0);
	
	public Sol() {
		
	};
	
	public Sol(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
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
	
}
