package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;


public class Main {

	public static void main(String[] args) {
		
		//GestionarMese gestionar=new GestionarMese();
		//Picolo picolo=new Picolo();
		//Masa masa=new Masa(12,4);
		
		//if(gestionar.esteLibera(masa.getCod())) {
			//if(picolo.esteMasaDebarasata(masa.getCod())) {
				
				//if(picolo.areServetele(masa.getCod())) {
					
					//System.out.println("Poftiti la masa cu codul "+masa.getCod());
				//}
				//else System.out.println("Mai asteptati");
			//}
			//else System.out.println("Mai asteptati");	
		//}
		//else System.out.println("Mai asteptati");
		
		Masa masa1= new Masa(5,10);
		if(Facade.potAsezaLaMasa(masa1)) {
			System.out.println("Poftiti la masa");
		}	
		else
		{
			System.out.println("Mai asteptati");
		}	
	}
}
