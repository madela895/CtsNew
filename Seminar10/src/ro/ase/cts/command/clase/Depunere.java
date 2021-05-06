package ro.ase.cts.command.clase;

public class Depunere extends Command {

	public Depunere(ContBancar contBancar,float suma) {
		super(contBancar,suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getContBancar().depunere(super.getSuma());
		
	}

}
