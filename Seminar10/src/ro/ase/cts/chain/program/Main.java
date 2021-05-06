package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;
import ro.ase.cts.chain.clase.ContIndisponibil;

public class Main {

	public static void main(String[] args) {
		Cont contCurent=new ContCurent(1500, "Dan", null);
		Cont contEconomii= new ContEconomii(2050, "Dana", null);
		Cont contCredit= new ContCredit (2000, "oana", null);
		Cont contIndisponibil=new ContIndisponibil(1000,"Ana",null);
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.plateste(500);
	}

}
