package ro.ase.cts.adapter.clase;

public class AdapterCrediteClasa extends Leasing implements CreditAbstract {

	public AdapterCrediteClasa(float suma, String numeClient) {
		super(suma, numeClient);
		
	}

	@Override
	public void oferaCredit() {
		super.creeazaLeasing();
		
	}

}
