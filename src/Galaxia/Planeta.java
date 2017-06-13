package Galaxia;

import Helper.Sentido;

public class Planeta extends SistemaSolar {
	private String nombre;
	private Sentido sentido;
	private Integer distancia;
	private Integer grados;

	Planeta(String nombre, Sentido sentido, Integer distancia, Integer grados) {
		this.nombre = nombre;
		this.sentido = sentido;
		this.distancia = distancia;
		this.grados = grados;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
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
	 * @param sentido
	 *            the sentido to set
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
	 * @param distancia
	 *            the distancia to set
	 */
	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}

	/**
	 * @return the grados
	 */
	public Integer getGrados() {
		return grados;
	}

	/**
	 * @param grados
	 *            the grados to set
	 */
	public void setGrados(Integer grados) {
		this.grados = grados;
	}

}
