package Galaxia;
import java.util.ArrayList;
import java.util.List;


public class Galaxia {

	private List<SistemaSolar> sistemasSolares;
	
	public Galaxia() {
		this.sistemasSolares = new ArrayList<SistemaSolar>();
	}
	
	public void addSistemaSolares(SistemaSolar sistemaSolar) {
		sistemasSolares.add(sistemaSolar);
	}
	
	public void removeSistemaSolar(SistemaSolar sistemaSolar) {
		if (this.sistemasSolares.contains(sistemaSolar)) {
			this.sistemasSolares.remove(sistemaSolar);
		} else {
			System.out.println("Sistema Solar inexistente: " + sistemaSolar);
		}
	}

	/**
	 * @return the sistemasSolares
	 */
	public List<SistemaSolar> getSistemasSolares() {
		return sistemasSolares;
	}

	/**
	 * @param sistemasSolares the sistemasSolares to set
	 */
	public void setSistemasSolares(List<SistemaSolar> sistemasSolares) {
		this.sistemasSolares = sistemasSolares;
	}
	
}
