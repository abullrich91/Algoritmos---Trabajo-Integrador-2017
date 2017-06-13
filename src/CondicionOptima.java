
public class CondicionOptima extends Condicion {
	
	@Override
	public void atender(SistemaSolar sistemaSolar) {
		if (sistemaSolar.arePlanetsAlignedWithEachOther(sistemaSolar)) {
			System.out.println("Condicion Optima");
		} else {
			this.setSiguiente();
		}
	}
	
}
