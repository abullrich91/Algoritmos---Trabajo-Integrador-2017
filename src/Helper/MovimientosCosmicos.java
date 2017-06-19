package Helper;
import java.util.List;

import Galaxia.Planeta;
import Galaxia.SistemaSolar;

public interface MovimientosCosmicos {
	public Boolean arePlanetsAlignedWithEachOther(SistemaSolar sistemaSolar);
	public Boolean arePlanetsAlignedWithSun(SistemaSolar sistemaSolar);
	public Boolean isWithinPlanetsArea(SistemaSolar sistemaSolar);
	public Coordenadas getCoordenadas(Planeta planeta, Integer dias);
}
