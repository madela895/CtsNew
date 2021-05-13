package ro.ase.cts.facade.clase;

public class Medic {
private String nume;
private String specializare;

public boolean esteNecesaraInternarea(Pacient pacient) {
	return pacient.isEsteInStareGrav();
}

public Medic(String nume, String specializare) {
	super();
	this.nume = nume;
	this.specializare = specializare;
}



}
