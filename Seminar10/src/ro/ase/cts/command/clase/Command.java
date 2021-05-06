package ro.ase.cts.command.clase;

public abstract class Command {
	private ContBancar contBancar;
	private float suma;
	
	
	public Command(ContBancar contBancar, float suma) {
		super();
		this.contBancar = contBancar;
		this.suma=suma;
	}


	public float getSuma() {
		return suma;
	}


	public ContBancar getContBancar() {
		return contBancar;
	}


	public abstract void executa();
}
