package ro.ase.cts.proxy.clase;

public class ProxyOperatorRezervare implements OperatorRezervari {
private OperatorRezervari operatorRezervari;
private int nrMinPersoane;

	public ProxyOperatorRezervare(OperatorRezervari operatorRezervari, int nrMinPersoane) {
	super();
	this.operatorRezervari = operatorRezervari;
	this.nrMinPersoane=nrMinPersoane;
}

	@Override
	public void realizeazaRezervare(int nrPersoane) {
		if(nrPersoane>=nrMinPersoane) {
			operatorRezervari.realizeazaRezervare(nrPersoane);
		}
		else System.out.println("Va rugam veniti la restaurant fara rez");
	}

}
