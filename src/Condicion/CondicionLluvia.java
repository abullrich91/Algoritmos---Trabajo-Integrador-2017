package Condicion;

import Galaxia.SistemaSolar;
import Helper.MovimientosCosmicos;

public class CondicionLluvia extends Condicion {
	
	private Integer totalLluvias = 0;
	private Integer diaPicoMasAlto = 0;
	private Integer perimetroMaximoLocal = 0;
	private Integer perimetroDia = 0;
	
	public CondicionLluvia(ConditionObservable co) {
		this.co = co;
	}
	
	@Override
	public void atender(SistemaSolar sistemaSolar) {
		if (MovimientosCosmicos.isWithinPlanetsArea(sistemaSolar)) {
			ConditionObservable ov = this.getCo();
			this.totalLluvias++;
			ov.notificarInteresados("Condición Lluvia, sol dentro del perímetro de los planetas");
		} else {
			this.setSiguiente();
		}
	}

	@Override
	public Integer imprimirTotales(Condicion condicion) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
