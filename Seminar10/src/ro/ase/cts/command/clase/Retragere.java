package ro.ase.cts.command.clase;

public class Retragere extends Command {

	public Retragere(ContBancar contBancar,float suma) {
		super(contBancar,suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getContBancar().retragere(super.getSuma());
		
	}

}
