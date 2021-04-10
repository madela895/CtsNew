package ro.ase.cts.decoratormultiplu.clase;

public abstract class DecoratorAbstract implements OperatorBilet {
	
	private OperatorBilet bilet;
	
	
	
	public DecoratorAbstract(OperatorBilet bilet) {
		super();
		this.bilet = bilet;
	}



	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		bilet.rezervaBilet();
		
	}



	@Override
	public String getnumeGazda() {
		// TODO Auto-generated method stub
		return bilet.getnumeGazda();
	}



	@Override
	public String getnumeOaspeti() {
		// TODO Auto-generated method stub
		return bilet.getnumeOaspeti();
	}

}
