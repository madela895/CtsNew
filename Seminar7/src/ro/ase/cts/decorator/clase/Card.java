package ro.ase.cts.decorator.clase;

public class Card implements CardAbstract {
 private String titular;
 private String numeCard;
public Card(String titular, String numeCard) {
	super();
	this.titular = titular;
	this.numeCard = numeCard;
}



public String getTitular() {
	return titular;
}



public void setTitular(String titular) {
	this.titular = titular;
}



public String getNumeCard() {
	return numeCard;
}



public void setNumeCard(String numeCard) {
	this.numeCard = numeCard;
}



@Override
public void platestePOS() {
	System.out.println(this.titular+" a realizaat o plata la pos");
	
}
@Override
public void platesteOnline() {
	System.out.println(this.titular+" a realizaat o plata online");
	
}
 
 
}
