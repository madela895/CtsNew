package ro.ase.cts.facade.clase;

public class Facade {
 public static boolean potAsezaLaMasa(Masa masa) {
	 GestionarMese gestionar=new GestionarMese();
	 Picolo picolo=new Picolo();
	 
	 if(gestionar.esteLibera(masa.getCod()))
	 {
			if(picolo.esteMasaDebarasata(masa.getCod()))
			{
				
				if(picolo.areServetele(masa.getCod())) 
				{
					
					return true;
				}
				return false;
			}
			return false;	
		}
	 return false;
	}
 
}
