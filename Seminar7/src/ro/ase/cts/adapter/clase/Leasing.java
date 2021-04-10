package ro.ase.cts.adapter.clase;

public class Leasing {
private float suma;
private String numeClient;

public Leasing(float suma, String numeClient) {
	super();
	this.suma = suma;
	this.numeClient = numeClient;
}


public void creeazaLeasing() {
	System.out.println(numeClient+" are un leasing de: "+ suma);
}
}
