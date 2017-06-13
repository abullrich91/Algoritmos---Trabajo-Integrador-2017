package Condicion;

import Galaxia.SistemaSolar;

public abstract class Condicion {
	
	protected Condicion siguiente;
	
	public abstract void atender(SistemaSolar sistemaSolar);

	/**
	 * @return the siguiente
	 */
	public Condicion getSiguiente() {
		return siguiente;
	}

	protected void setSiguiente() {
		// TODO Do something
	}
	
	/**
	 * @param siguiente the siguiente to set
	 */
	protected void setSiguiente(Condicion siguiente) {
		this.siguiente = siguiente;
	}
	
}
