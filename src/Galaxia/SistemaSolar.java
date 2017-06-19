package Galaxia;

import java.util.ArrayList;
import java.util.Iterator;
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

	@Override
	public Boolean arePlanetsAlignedWithEachOther(SistemaSolar sistemaSolar) {
		Iterator<Planeta> planetIterator = sistemaSolar.getPlanetas().iterator();
		Planeta planetaOrigen = planetIterator.next();
		ArrayList<Double> arrayPendientes = new ArrayList<Double>();
		while (planetIterator.hasNext()) {
			Coordenadas coordenadasOrigen = this.determinarPuntos(planetaOrigen);
			Planeta planetaDestino = planetIterator.next();
			Coordenadas coordenadasDestino = this.determinarPuntos(planetaDestino);
			Double pendiente = determinarPendiente(coordenadasOrigen, coordenadasDestino);
			System.out.println(Math.round(pendiente * 100.0) / 100.0);
			arrayPendientes.add(Math.round(pendiente * 100.0) / 100.0);
			planetaOrigen = planetaDestino;
		}
		Double pendienteAnterior = arrayPendientes.get(0);
		for (Double pendiente : arrayPendientes) {
			Double valorAbsoluto = Math.abs(pendienteAnterior - pendiente);
			if (valorAbsoluto >= 0.3) {
				return false;
			}
		}
		System.out.println("Planetas Alineados!!!");
		return true;
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

	private Coordenadas determinarPuntos(Planeta planeta) {
		Integer hipotenusa = planeta.getDistancia();
		Double grados = planeta.getGrados();
		Double catetoOpuesto = Math.sin(grados) * hipotenusa;
		Double catetoAdyacente = Math.cos(grados) * hipotenusa;
		return new Coordenadas(catetoOpuesto, catetoAdyacente);
	}

	private Double determinarPendiente(Coordenadas coordenadasOrigen, Coordenadas coordenadasDestino) {
		Double nominador = coordenadasDestino.getCoordenadaY() - coordenadasOrigen.getCoordenadaY();
		Double denominador = coordenadasDestino.getCoordenadaX() - coordenadasOrigen.getCoordenadaX();
		return nominador / denominador;
	}

}
