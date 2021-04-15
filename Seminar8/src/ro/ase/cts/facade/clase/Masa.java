package ro.ase.cts.facade.clase;

public class Masa {
private int cod;
private int nrMaximPersoane;
public int getCod() {
	return cod;
}
public void setCod(int cod) {
	this.cod = cod;
}
public int getNrMaximPersoane() {
	return nrMaximPersoane;
}


@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Masa [cod=");
	builder.append(cod);
	builder.append(", nrMaximPersoane=");
	builder.append(nrMaximPersoane);
	builder.append("]");
	return builder.toString();
}
public void setNrMaximPersoane(int nrMaximPersoane) {
	this.nrMaximPersoane = nrMaximPersoane;
}


public Masa(int cod, int nrMaximPersoane) {
	super();
	this.cod = cod;
	this.nrMaximPersoane = nrMaximPersoane;
}


}
