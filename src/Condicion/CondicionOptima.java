package Condicion;

import Galaxia.SistemaSolar;
import Helper.MovimientosCosmicos;

public class CondicionOptima extends Condicion {
	
	@Override
	public void atender(SistemaSolar sistemaSolar) {
		if (MovimientosCosmicos.arePlanetsAlignedWithEachOther(sistemaSolar)) {
			System.out.println("Condicion Optima, Planetas alineados entre sí");
		} else {
			this.setSiguiente();
		}
	}
	
}
