package Condicion;

import Galaxia.SistemaSolar;
import Helper.MovimientosCosmicos;

public class CondicionOptima extends Condicion {
	
	public CondicionOptima(ConditionObservable co) {
		this.co = co;
	}
	
	@Override
	public void atender(SistemaSolar sistemaSolar) {
		if (MovimientosCosmicos.arePlanetsAlignedWithEachOther(sistemaSolar)) {
			ConditionObservable ov = this.getCo();
			ov.notificarInteresados("Condicion Optima, Planetas alineados entre sí");
		} else {
			this.setSiguiente(new CondicionLluvia(co));
			this.getSiguiente().atender(sistemaSolar);
		}
	}
	
}
