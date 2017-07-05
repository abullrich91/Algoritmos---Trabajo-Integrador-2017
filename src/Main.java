import java.util.Observer;

import Condicion.Condicion;
import Condicion.CondicionSequia;
import Condicion.ConditionObservable;
import Condicion.ConditionObserver;
import Galaxia.Galaxia;
import Galaxia.Planeta;
import Galaxia.SistemaSolar;
import Galaxia.Sol;
import Helper.Antihorario;
import Helper.Coordenadas;
import Helper.Horario;

public class Main {
	public static void main(String[] args) {
		Integer dia = 1;

		Galaxia galaxia = new Galaxia();

		Sol sol = new Sol(new Coordenadas(0.0, 0.0));
		Planeta alderaan = new Planeta("Alderaan", new Horario(1), 500, 0.0);
		Planeta felucia = new Planeta("Felucia", new Horario(3), 2000, 0.0);
		Planeta peragus = new Planeta("Peragus", new Antihorario(5), 1000, 0.0);

		SistemaSolar sistemaSolar = new SistemaSolar();
		sistemaSolar.setSol(sol);
		sistemaSolar.addPlanet(alderaan);
		sistemaSolar.addPlanet(felucia);
		sistemaSolar.addPlanet(peragus);

		galaxia.addSistemaSolares(sistemaSolar);

		ConditionObservable ov = new ConditionObservable();
		Observer alderaanObserver = new ConditionObserver(ov);
		Observer feluciaObserver = new ConditionObserver(ov);
		Observer peragusObserver = new ConditionObserver(ov);
		ov.addObserver(alderaanObserver);
		ov.addObserver(feluciaObserver);
		ov.addObserver(peragusObserver);
		
		// Menor a diez años
		while (dia <= 3650) {
			for (SistemaSolar ss : galaxia.getSistemasSolares()) {
				for (Planeta planeta : ss.getPlanetas()) {
					sol.rotate(planeta);
				}
				Condicion condicionSequia = new CondicionSequia(ov);
				condicionSequia.atender(ss);
				dia++;
				System.out.println("################");
				System.out.println("Día: " + dia.toString());
//				System.out.println("################");
			}
		}
		
		// TODO imprimir totales de eventos
	}
}
