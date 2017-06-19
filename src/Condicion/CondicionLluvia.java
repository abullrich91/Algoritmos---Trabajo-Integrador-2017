package Condicion;

import Galaxia.SistemaSolar;
import Helper.MovimientosCosmicos;

public class CondicionLluvia extends Condicion {
	
	@Override
	public void atender(SistemaSolar sistemaSolar) {
		if (MovimientosCosmicos.arePlanetsAlignedWithSun(sistemaSolar)) {
			System.out.println("Condición Lluvia, planetas alineados con el sol");
		} else {
			this.setSiguiente(new CondicionOptima());
			siguiente.atender(sistemaSolar);
		}
	}
	
}
