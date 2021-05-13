package ro.ase.cts.facade.clase;

public class Pacient {
	private String nume;
	private boolean esteInStareGrav;
	public Pacient(String nume, boolean esteInStareGrav) {
		super();
		this.nume = nume;
		this.esteInStareGrav = esteInStareGrav;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public boolean isEsteInStareGrav() {
		return esteInStareGrav;
	}
	public void setEsteInStareGrav(boolean esteInStareGrav) {
		this.esteInStareGrav = esteInStareGrav;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pacient [nume=");
		builder.append(nume);
		builder.append(", esteInStareGrav=");
		builder.append(esteInStareGrav);
		builder.append("]");
		return builder.toString();
	}
	
	
}
