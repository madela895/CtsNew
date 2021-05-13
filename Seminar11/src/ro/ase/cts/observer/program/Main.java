package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.Sala;

public class Main {

	public static void main(String[] args) {
		ClientAbonat Popescu= new ClientAbonat("Popescu");
		ClientAbonat Vasilescu= new ClientAbonat("vasilescxu");
		ClientAbonat marinescu= new ClientAbonat("Marinescu");
		
		Sala sala=new Sala("Sala sportiva");
		
		sala.aboneazaClient(marinescu);
		sala.dezaboneazaClient(marinescu);
		sala.aboneazaClient(Vasilescu);
		sala.aboneazaClient(Popescu);
	}

}
