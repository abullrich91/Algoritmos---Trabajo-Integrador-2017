
public class CondicionSequia extends Condicion {
	
	@Override
	public void atender(SistemaSolar sistemaSolar) {
		if (sistemaSolar.getSol().isWithinPlanetsArea(sistemaSolar)) {
			System.out.println("Condicion Sequia");
		} else {
			this.setSiguiente(new CondicionLluvia());
			siguiente.atender(sistemaSolar);
		}
	}
	
}
