package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract {

	@Override
	public void asezareLaCoada() {
		System.out.println("s a asezat la coada");
	}

	@Override
	public void prezinteBilet() {
		System.out.println("a prezentat biletul");

	}

	@Override
	public void realizazaControlCorporal() {
		System.out.println("a realizat controlul corporal");

	}

	@Override
	public void intraPeStadion() {
		System.out.println("a intrat pe stadion");

	}

	@Override
	public void ocupaLoc() {
		System.out.println("a ocupat un loc");

	}

}
