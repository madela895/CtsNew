package ro.ase.cts.command.clase;

public class Constituire extends Command{

	public Constituire(ContBancar contBancar, float suma) {
		super(contBancar,suma);
		
	}

	@Override
	public void executa() {
		super.getContBancar().constituire(super.getSuma());
	}

}
