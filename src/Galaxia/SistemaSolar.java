package Galaxia;

import java.util.ArrayList;
import java.util.List;

public class SistemaSolar {
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

	/**
	 * @return the sistemaSolar
	 */
	public List<Planeta> getPlanetas() {
		return planetas;
	}

	/**
	 * @param sistemaSolar
	 *            the sistemaSolar to set
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
	 * @param sol
	 *            the sol to set
	 */
	public void setSol(Sol sol) {
		this.sol = sol;
	}

}
