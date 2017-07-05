package Condicion;

import Galaxia.SistemaSolar;
import Helper.MovimientosCosmicos;

public class CondicionSequia extends Condicion {
	
	public CondicionSequia(ConditionObservable co) {
		this.co = co;
	}
	
	@Override
	public void atender(SistemaSolar sistemaSolar) {
		if (MovimientosCosmicos.arePlanetsAlignedWithSun(sistemaSolar)) {
			ConditionObservable ov = this.getCo();
			ov.notificarInteresados("Condicion Sequia, planetas alineados con el sol");
		} else {
			this.setSiguiente(new CondicionOptima(co));
			this.getSiguiente().atender(sistemaSolar);
		}
	}
	
}
