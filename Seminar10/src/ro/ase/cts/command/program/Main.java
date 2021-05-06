package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.Constituire;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.Depunere;
import ro.ase.cts.command.clase.ManagerComenzi;
import ro.ase.cts.command.clase.Retragere;

public class Main {

	public static void main(String[] args) {
		
		ManagerComenzi manager=new ManagerComenzi();
		
		manager.invoca(new Constituire(new ContBancar("ana", 200), 0));
		manager.invoca(new Depunere(new ContBancar("Dan", 300), 0));
		manager.invoca(new Retragere(new ContBancar("ana", 100), 0));

	}

}
