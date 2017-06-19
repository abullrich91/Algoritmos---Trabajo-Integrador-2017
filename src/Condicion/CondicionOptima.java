package Condicion;

import Galaxia.SistemaSolar;

public class CondicionOptima extends Condicion {
	
	@Override
	public void atender(SistemaSolar sistemaSolar) {
		if (sistemaSolar.arePlanetsAlignedWithEachOther(sistemaSolar)) {
			System.out.println("Condicion Optima, Planetas alineados entre sí");
		} else {
			this.setSiguiente();
		}
	}
	
}
