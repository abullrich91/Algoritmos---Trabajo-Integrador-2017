package Galaxia;
import java.util.ArrayList;
import java.util.List;

import Helper.Coordenadas;
import Helper.MovimientosCosmicos;

public class SistemaSolar implements MovimientosCosmicos {
	private Sol sol;
	private List<Planeta> planetas;
	
	public SistemaSolar() {
		this.planetas = new ArrayList<Planeta>();
	}
	
	public void addPlanet(Planeta planeta) {
		this.planetas.add(planeta);
	}
	
	public void removePlanet(Planeta planeta) {
		if (this.planetas.contains(planeta)) {
			this.planetas.remove(planeta);
		} else {
			System.out.println("Planeta inexistente: " + planeta);
		}
	}

	@Override
	public Coordenadas getCoordenadas(Planeta planeta, Integer dias) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @return the sistemaSolar
	 */
	public List<Planeta> getPlanetas() {
		return planetas;
	}

	/**
	 * @param sistemaSolar the sistemaSolar to set
	 */
	public void setPlanetas(List<Planeta> planetas) {
		this.planetas = planetas;
	}

	/**
	 * @return the sol
	 */
	public Sol getSol() {
		return sol;
	}

	/**
	 * @param sol the sol to set
	 */
	public void setSol(Sol sol) {
		this.sol = sol;
	}
	
	@Override
	public Boolean arePlanetsAlignedWithEachOther(SistemaSolar sistemaSolar) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Boolean arePlanetsAlignedWithSun(List<Planeta> planeta) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Boolean isWithinPlanetsArea(SistemaSolar sistemaSolar) {
		return false;
	}
	
}
