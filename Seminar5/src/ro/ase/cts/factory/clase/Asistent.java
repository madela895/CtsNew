package ro.ase.cts.factory.clase;

public class Asistent extends PersonalMedical {
	
	  public Asistent(String nume, float salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("Asistent{");
	        sb.append(super.toString()).append('}');
	        return sb.toString();
	    }

}
