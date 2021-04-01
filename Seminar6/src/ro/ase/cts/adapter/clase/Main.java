package ro.ase.cts.adapter.clase;

import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Main {

	public static void rezervaSiVindeBilet(BiletOnline biletOnline) {
		biletOnline.rezervaBilet();
		biletOnline.vindeBilet();
	}
	
	public static void main(String[] args) {
		Bilet bilet=new Bilet(200);
		BiletOnline biletOnline=new AdapterBilet(20);
		rezervaSiVindeBilet(biletOnline);
		biletOnline.rezervaBilet();
	}

}
