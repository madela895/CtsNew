package ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
	
	public final void intrareaSpectatoruluiPeStadion() {
		asezareLaCoada();
		prezinteBilet();
		realizazaControlCorporal();
		intraPeStadion();
		ocupaLoc();
	}
	
	
	public abstract void asezareLaCoada();
	public abstract void prezinteBilet();
	public abstract void realizazaControlCorporal();
	public abstract void intraPeStadion();
	public abstract void ocupaLoc();
}
