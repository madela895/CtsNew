package ro.ase.cts.chain.clase;

public class ContCredit extends Cont {

	public ContCredit(float sold, String numeClient, Cont succesor) {
		super(sold, numeClient, succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold() >= suma) {
			System.out.println(super.getNumeClient()+" a realizat plata de : "+ suma +" din contul de credit");
		}else
		{
			super.getSuccesor().plateste(suma);
		}
		
	}

}
