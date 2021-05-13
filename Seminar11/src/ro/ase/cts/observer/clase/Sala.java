package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Subiect {
	private String numeSala;
private List<Observer> observeri;
@Override
public void aboneazaClient(Observer observer) {
	observeri.add(observer);
}
@Override
public void dezaboneazaClient(Observer observer) {
	observeri.remove(observer);
}
@Override
public void trimiteMeaj(String mesaj) {
	for(Observer obs : observeri) {
		obs.receptionareMesaj(numeSala+ ":"+ mesaj);
	}
}


public void anuntaMeciFotbal(String mesaj)
{
	trimiteMeaj(mesaj);
}





public Sala(String nume) {
	super();
	this.numeSala = nume;
	this.observeri = new ArrayList<>();
}



}
