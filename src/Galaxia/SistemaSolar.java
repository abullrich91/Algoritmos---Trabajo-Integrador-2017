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
		ArrayList<Cuerpo> cuerpoArray = new ArrayList<Cuerpo>();
		for (Planeta planeta : sistemaSolar.getPlanetas()) {
			cuerpoArray.add(planeta);
		}
		Iterator<Cuerpo> planetIterator = cuerpoArray.iterator();
		ArrayList<Double> arrayPendientes = new ArrayList<Double>();
		arrayPendientes = getSlopeArray(arrayPendientes, planetIterator);
		return slopeComparator(arrayPendientes);
	}

	@Override
	public Boolean arePlanetsAlignedWithSun(SistemaSolar sistemaSolar) {
		ArrayList<Cuerpo> cuerpoArray = new ArrayList<Cuerpo>();
		cuerpoArray.add(sistemaSolar.getSol());
		for (Planeta planeta : sistemaSolar.getPlanetas()) {
			cuerpoArray.add(planeta);
		}
		Iterator<Cuerpo> cuerpoIterator = cuerpoArray.iterator();
		ArrayList<Double> arrayPendientes = new ArrayList<Double>();
		arrayPendientes = getSlopeArray(arrayPendientes, cuerpoIterator);
		return slopeComparator(arrayPendientes);
	}

	@Override
	public Boolean isWithinPlanetsArea(SistemaSolar sistemaSolar) {
		return false;
	}

	private Coordenadas determinarPuntos(Cuerpo planeta) {
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
	
	private ArrayList<Double> getSlopeArray(ArrayList<Double> arrayPendientes, Iterator<Cuerpo> cuerpoIterator) {
		Cuerpo planetaOrigen = cuerpoIterator.next();
		while (cuerpoIterator.hasNext()) {
			Coordenadas coordenadasOrigen = this.determinarPuntos(planetaOrigen);
			Cuerpo planetaDestino = cuerpoIterator.next();
			Coordenadas coordenadasDestino = this.determinarPuntos(planetaDestino);
			Double pendiente = determinarPendiente(coordenadasOrigen, coordenadasDestino);
			System.out.println(Math.round(pendiente * 100.0) / 100.0);
			arrayPendientes.add(Math.round(pendiente * 100.0) / 100.0);
			planetaOrigen = planetaDestino;
		}
		return arrayPendientes;
	}
	
	private Boolean slopeComparator(ArrayList<Double> arrayPendientes) {
		Double pendienteAnterior = arrayPendientes.get(0);
		for (Double pendiente : arrayPendientes) {
			Double valorAbsoluto = Math.abs(pendienteAnterior - pendiente);
			if (valorAbsoluto >= 0.3) {
				return false;
			}
		}
		return true;
	}

}
