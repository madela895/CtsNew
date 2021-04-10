package ro.ase.cts.decoratormultiplu.program;

import ro.ase.cts.decoratormultiplu.clase.Bilet;
import ro.ase.cts.decoratormultiplu.clase.DecoratorAbstract;
import ro.ase.cts.decoratormultiplu.clase.DecoratorSustinereEchipa;
import ro.ase.cts.decoratormultiplu.clase.DecoratorUrarePaste;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bilet bilet= new Bilet("Steaua","Rapid");
		bilet.rezervaBilet();
		
		DecoratorAbstract meciInGhencea= new DecoratorSustinereEchipa(bilet);
		meciInGhencea.rezervaBilet();
		
		DecoratorAbstract meciDePaste= new DecoratorUrarePaste(bilet);
		meciDePaste.rezervaBilet();
		
		DecoratorAbstract meciInGhenceaDePaste=new DecoratorSustinereEchipa(meciDePaste);
		meciInGhenceaDePaste.rezervaBilet();
	}

}
