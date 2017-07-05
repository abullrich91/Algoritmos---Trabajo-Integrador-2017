package Condicion;

import Galaxia.SistemaSolar;

public abstract class Condicion {

	private Condicion siguiente;
	protected ConditionObservable co = new ConditionObservable();

	public abstract void atender(SistemaSolar sistemaSolar);

	/**
	 * @return the siguiente
	 */
	public Condicion getSiguiente() {
		return siguiente;
	}

	public void setSiguiente() {
		// TODO Do something
	}

	/**
	 * @param siguiente
	 *            the siguiente to set
	 */
	public void setSiguiente(Condicion siguiente) {
		this.siguiente = siguiente;
	}

	public ConditionObservable getCo() {
		return co;
	}

	public void setCo(ConditionObservable co) {
		this.co = co;
	}
	
	public abstract Integer imprimirTotales(Condicion condicion);
	
}
