
public class CondicionLluvia extends Condicion {
	
	@Override
	public void atender(SistemaSolar sistemaSolar) {
		if (sistemaSolar.getSol().arePlanetsAlignedWithSun(sistemaSolar.getPlanetas())) {
			System.out.println("Atiende A");
		} else {
			this.setSiguiente(new CondicionOptima());
			siguiente.atender(sistemaSolar);
		}
	}
	
}
