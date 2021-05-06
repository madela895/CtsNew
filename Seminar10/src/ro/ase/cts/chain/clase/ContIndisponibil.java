package ro.ase.cts.chain.clase;

public class ContIndisponibil extends Cont {

	public ContIndisponibil(float sold, String numeClient, Cont succesor) {
		super(sold, numeClient, succesor);
		
	}

	@Override
	public void plateste(float suma) {
		System.out.println("Fonduri insuficiente");
	}

}
