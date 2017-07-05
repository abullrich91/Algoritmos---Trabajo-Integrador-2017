package Condicion;

import java.util.Observable;

public class ConditionObservable extends Observable {
	public void notificarInteresados(String mensaje) {
		setChanged();
		notifyObservers(mensaje);
	}
}
