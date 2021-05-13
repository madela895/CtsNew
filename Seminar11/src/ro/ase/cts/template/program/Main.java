package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorPeluza;

public class Main {

	public static void main(String[] args) {
	Spectator spectator=new Spectator();
	
	spectator.intraPeStadion();
	
	SpectatorPeluza spectpeluza=new SpectatorPeluza();
	
	spectpeluza.intraPeStadion();
	
	
	}

}
