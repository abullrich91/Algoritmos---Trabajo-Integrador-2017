package Helper;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Galaxia.Cuerpo;
import Galaxia.Planeta;
import Galaxia.SistemaSolar;
import Galaxia.Sol;

public class MovimientosCosmicos {
	public static Boolean arePlanetsAlignedWithEachOther(SistemaSolar sistemaSolar) {
		Iterator<Cuerpo> cuerpoIterator = createBodyIterator(sistemaSolar.getPlanetas(), null);
		return getAndCompareSlopes(cuerpoIterator);
	}
	
	public static Boolean arePlanetsAlignedWithSun(SistemaSolar sistemaSolar) {
		Iterator<Cuerpo> cuerpoIterator = createBodyIterator(sistemaSolar.getPlanetas(), sistemaSolar.getSol());
		return getAndCompareSlopes(cuerpoIterator);
	}
	
	public static Boolean isWithinPlanetsArea(SistemaSolar sistemaSolar) {
		Polygon polygon = new Polygon();
		for (Planeta planet : sistemaSolar.getPlanetas()) {
			Coordenadas coordenadas = determinarPuntos(planet);
			polygon.addPoint(coordenadas.getCoordenadaX().intValue(), coordenadas.getCoordenadaY().intValue());
		}
		Coordenadas coordenadasSol = determinarPuntos(sistemaSolar.getSol());
		return polygon.contains(coordenadasSol.getCoordenadaX(), coordenadasSol.getCoordenadaY());
	}
	
	private static Iterator<Cuerpo> createBodyIterator(List<Planeta> planetList, Sol sol) {
		ArrayList<Cuerpo> cuerpoArray = new ArrayList<Cuerpo>();
		if (sol != null) {
			cuerpoArray.add(sol);
		}
		for (Planeta planeta : planetList) {
			cuerpoArray.add(planeta);
		}
		return cuerpoArray.iterator();
	}
	
	private static Boolean getAndCompareSlopes(Iterator<Cuerpo> cuerpoIterator) {
		ArrayList<Double> arrayPendientes = new ArrayList<Double>();
		arrayPendientes = getSlopeArray(arrayPendientes, cuerpoIterator);
		return slopeComparator(arrayPendientes);
	}
	
	private static ArrayList<Double> getSlopeArray(ArrayList<Double> arrayPendientes, Iterator<Cuerpo> cuerpoIterator) {
		Cuerpo planetaOrigen = cuerpoIterator.next();
		while (cuerpoIterator.hasNext()) {
			Coordenadas coordenadasOrigen = determinarPuntos(planetaOrigen);
			Cuerpo planetaDestino = cuerpoIterator.next();
			Coordenadas coordenadasDestino = determinarPuntos(planetaDestino);
			Double pendiente = determinarPendiente(coordenadasOrigen, coordenadasDestino);
			// System.out.println(Math.round(pendiente * 100.0) / 100.0);
			arrayPendientes.add(Math.round(pendiente * 100.0) / 100.0);
			planetaOrigen = planetaDestino;
		}
		return arrayPendientes;
	}
	
	private static Boolean slopeComparator(ArrayList<Double> arrayPendientes) {
		Double pendienteAnterior = arrayPendientes.get(0);
		for (Double pendiente : arrayPendientes) {
			Double valorAbsoluto = Math.abs(pendienteAnterior - pendiente);
			if (valorAbsoluto >= 0.3) {
				return false;
			}
		}
		return true;
	}
	
	public static Coordenadas determinarPuntos(Cuerpo planeta) {
		Integer hipotenusa = planeta.getDistancia();
		Double grados = planeta.getGrados();
		Double catetoOpuesto = Math.sin(grados) * hipotenusa;
		Double catetoAdyacente = Math.cos(grados) * hipotenusa;
		return new Coordenadas(catetoOpuesto, catetoAdyacente);
	}

	private static Double determinarPendiente(Coordenadas coordenadasOrigen, Coordenadas coordenadasDestino) {
		Double nominador = coordenadasDestino.getCoordenadaY() - coordenadasOrigen.getCoordenadaY();
		Double denominador = coordenadasDestino.getCoordenadaX() - coordenadasOrigen.getCoordenadaX();
		return nominador / denominador;
	}
}
