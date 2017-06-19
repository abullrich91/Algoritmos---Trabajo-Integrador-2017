package Galaxia;

import Helper.Sentido;

public class Planeta extends SistemaSolar implements Cuerpo {
	private String nombre;
	private Sentido sentido;
	private Integer distancia;
	private Double grados;
	private Planeta next;
	
	public Planeta() {
		
	}

	public Planeta(String nombre, Sentido sentido, Integer distancia, Double grados) {
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
	public Double getGrados() {
		return grados;
	}

	/**
	 * @param grados
	 *            the grados to set
	 */
	public void setGrados(Double grados) {
		this.grados = grados;
	}

	public Planeta getNext() {
		return next;
	}

	public void setNext(Planeta next) {
		this.next = next;
	}
	
}
