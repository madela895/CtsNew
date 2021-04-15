package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) {
		Sectiune sectiuneBauturi=new Sectiune("Bauturi");
		Sectiune sectiuneDesert=new Sectiune("Desert");
		Item itemFrappe=new Item("Frappe");
		Item itemCafea=new Item("Cafea");
		Item itemEcler=new Item("Ecler");
		
		sectiuneBauturi.addComponent(itemCafea);
		sectiuneBauturi.addComponent(itemFrappe);
		sectiuneDesert.addComponent(itemEcler);
		
		Sectiune meniu=new Sectiune("Meniu");
		meniu.addComponent(sectiuneDesert);
		meniu.addComponent(sectiuneBauturi);
		meniu.afiseazaDescriere();
		
		sectiuneBauturi.stergeComponent(itemFrappe);
		sectiuneDesert.addComponent(itemFrappe);
		
		meniu.afiseazaDescriere();
	}

}
