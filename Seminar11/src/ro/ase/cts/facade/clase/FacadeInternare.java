package ro.ase.cts.facade.clase;

public class FacadeInternare {
	
	
	
	
	public static String VerificaPacient(Pacient pacient) {
		Medic medic=new Medic("Ion","Ortoped");
		StringBuilder sb=new StringBuilder();
		if(pacient.isEsteInStareGrav()) {
			sb.append("Pacientul"+ pacient.getNume()+ " este in stare grava, trimite catre medic") ;
			}
		else {
			sb.append("Pacientul nu necesita internare");
		}
		
		if(medic.esteNecesaraInternarea(pacient)) {
			sb.append("Medicul a decis ca este necesara internarea");
			Salon salon=new Salon(20);
			if(salon.arePaturiLibere()) {
				sb.append(pacient.getNume()+" poate fi internat in salonl nostru");
			}else
				sb.append((pacient.getNume()+" nu are loc disp, va fi trimis catre alt spital"));
		}
		
		return sb.toString();
	}
}
