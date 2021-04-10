package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements CardAbstract{

	private CardAbstract cardAbstract;

	public DecoratorAbstract(CardAbstract cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}

	

	@Override
	public void platesteOnline() {
		cardAbstract.platesteOnline();
		
	}
	
	@Override
	public void platestePOS() {
		cardAbstract.platestePOS();
		
	}
	
	
	
	public CardAbstract getCardAbstract() {
		return cardAbstract;
	}

	public void setCardAbstract(CardAbstract cardAbstract) {
		this.cardAbstract = cardAbstract;
	}

	public abstract void platesteContactLess();
	
}
