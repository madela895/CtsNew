package ro.ase.cts.decoratormultiplu.clase;

public class DecoratorUrarePaste extends DecoratorAbstract {

	public DecoratorUrarePaste(OperatorBilet bilet) {
		super(bilet);
		// TODO Auto-generated constructor stub
	} 

	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Paste fericit!");
	}
}
