package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.FacadeInternare;
import ro.ase.cts.facade.clase.Pacient;

public class Main {

	public static void main(String[] args) {
		Pacient p1=new Pacient("Oana", false);
		Pacient p2=new Pacient("Ion", true);
		
		System.out.println(FacadeInternare.VerificaPacient(p1));
		System.out.println(FacadeInternare.VerificaPacient(p2));
	}

}
