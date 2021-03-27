package ro.ase.cts.factory.clase;

public class Main {
	public static void Main(String[] args) {
		Factory factory=new Factory();
		
		PersonalMedical asistent1 = factory.create(TipPersonal.ASISTENT, "Popa", 5200);
		PersonalMedical medic1= factory.create(TipPersonal.MEDIC, "Ionescu", 5000);
		
		System.out.println(medic1);
		System.out.println(asistent1);
	}
	
}
