package ro.ase.cts.builder.clase;

public class Rezervare {
 private int codRezervare;
 private boolean areMancareInclusa;
 private boolean areBauturaInclusa;
 private boolean areScaunErgonomic;
 private String genMuzical;
 private boolean areMuzicaAmbientala;
 
 
public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areBauturaInclusa, boolean areScaunErgonomic,
		String genMuzical, boolean areMuzicaAmbientala) {
	super();
	this.codRezervare = codRezervare;
	this.areMancareInclusa = areMancareInclusa;
	this.areBauturaInclusa = areBauturaInclusa;
	this.areScaunErgonomic = areScaunErgonomic;
	this.genMuzical = genMuzical;
	this.areMuzicaAmbientala = areMuzicaAmbientala;
}


@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Rezervare [codRezervare=");
	builder.append(codRezervare);
	builder.append(", areMancareInclusa=");
	builder.append(areMancareInclusa);
	builder.append(", areBauturaInclusa=");
	builder.append(areBauturaInclusa);
	builder.append(", areScaunErgonomic=");
	builder.append(areScaunErgonomic);
	builder.append(", genMuzical=");
	builder.append(genMuzical);
	builder.append(", areMuzicaAmbientala=");
	builder.append(areMuzicaAmbientala);
	builder.append("]");
	return builder.toString();
}


public int getCodRezervare() {
	return codRezervare;
}


public void setCodRezervare(int codRezervare) {
	this.codRezervare = codRezervare;
}


public boolean isAreMancareInclusa() {
	return areMancareInclusa;
}


public void setAreMancareInclusa(boolean areMancareInclusa) {
	this.areMancareInclusa = areMancareInclusa;
}


public boolean isAreBauturaInclusa() {
	return areBauturaInclusa;
}


public void setAreBauturaInclusa(boolean areBauturaInclusa) {
	this.areBauturaInclusa = areBauturaInclusa;
}


public boolean isAreScaunErgonomic() {
	return areScaunErgonomic;
}


public void setAreScaunErgonomic(boolean areScaunErgonomic) {
	this.areScaunErgonomic = areScaunErgonomic;
}


public String getGenMuzical() {
	return genMuzical;
}


public void setGenMuzical(String genMuzical) {
	this.genMuzical = genMuzical;
}


public boolean isAreMuzicaAmbientala() {
	return areMuzicaAmbientala;
}


public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
	this.areMuzicaAmbientala = areMuzicaAmbientala;
}
 
 
 
}
