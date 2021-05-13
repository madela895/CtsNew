package ro.ase.cts.facade.clase;

public class Pat {
private int nrPat;
private boolean liber;
public Pat(int nrPat, boolean liber) {
	super();
	this.nrPat = nrPat;
	this.liber = liber;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Pat [nrPat=");
	builder.append(nrPat);
	builder.append(", liber=");
	builder.append(liber);
	builder.append("]");
	return builder.toString();
}
public int getNrPat() {
	return nrPat;
}
public void setNrPat(int nrPat) {
	this.nrPat = nrPat;
}
public boolean isLiber() {
	return liber;
}
public void setLiber(boolean liber) {
	this.liber = liber;
}


}
