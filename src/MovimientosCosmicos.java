import java.util.List;

public interface MovimientosCosmicos {
	public void rotate(Sentido sentido);
	public Boolean arePlanetsAlignedWithSun(List<Planeta> planeta);
	public Boolean arePlanetsAlignedWithEachOther(List<Planeta> planeta);
	public Coordenadas getCoordenadas(Planeta planeta, Integer dias);
}
