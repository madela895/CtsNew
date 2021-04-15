package ro.ase.cts.composite.clase;

public interface ComponentaAbstracta {
	public void afiseazaDescriere();
	public void addComponent(ComponentaAbstracta componentaAbstracta) throws Exception;
	public void stergeComponent(ComponentaAbstracta componentaAbstracta);
	public ComponentaAbstracta getComponenta(int pozitie);
}
