package ro.ase.cts.decoratormultiplu.clase;

public class Bilet implements OperatorBilet {
private String numeGazda;
private String numeOaspeti;


public Bilet(String numeGazda, String numeOaspeti) {
	super();
	this.numeGazda = numeGazda;
	this.numeOaspeti = numeOaspeti;
}


@Override
public void rezervaBilet() {
	// TODO Auto-generated method stub
	System.out.println(numeGazda+" joaca impotriva "+ numeOaspeti);
}


public String getNumeGazda() {
	return numeGazda;
}


public void setNumeGazda(String numeGazda) {
	this.numeGazda = numeGazda;
}


public String getNumeOaspeti() {
	return numeOaspeti;
}


public void setNumeOaspeti(String numeOaspeti) {
	this.numeOaspeti = numeOaspeti;
}


@Override
public String getnumeGazda() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public String getnumeOaspeti() {
	// TODO Auto-generated method stub
	return null;
}


}
