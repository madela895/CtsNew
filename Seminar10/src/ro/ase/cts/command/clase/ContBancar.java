package ro.ase.cts.command.clase;

public class ContBancar {
	private String detinator;
	private float suma;
	
	
	public ContBancar(String detinator, float suma) {
		super();
		this.detinator = detinator;
		this.suma=0;
	}
	
	public void constituire(float suma) {
		System.out.println("contul a fost constituit");
		this.suma=suma;
	}
	public void retragere(float suma) {
		if(this.suma>= suma) {
			this.suma=this.suma-suma;
			System.out.println("o retragere a fost ");
		}
		else
		{
			System.out.println("Nu dispuneti de fonduri suficiente");
		}
	}
	
	public void depunere(float suma) {
		this.suma=this.suma+suma;
		System.out.println("suma a fost depusa");
	}

}
