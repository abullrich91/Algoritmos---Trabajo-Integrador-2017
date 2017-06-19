package Condicion;

import Galaxia.SistemaSolar;
import Helper.MovimientosCosmicos;

public class CondicionSequia extends Condicion {
	
	@Override
	public void atender(SistemaSolar sistemaSolar) {
		if (MovimientosCosmicos.isWithinPlanetsArea(sistemaSolar)) {
			System.out.println("Condicion Sequia");
		} else {
			this.setSiguiente(new CondicionLluvia());
			siguiente.atender(sistemaSolar);
		}
	}
	
}
