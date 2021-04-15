package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.Operator;
import ro.ase.cts.proxy.clase.OperatorRezervari;
import ro.ase.cts.proxy.clase.ProxyOperatorRezervare;


public class Main {

	public static void main(String[] args) {
		OperatorRezervari operator1=new Operator();
		operator1.realizeazaRezervare(2);
		ProxyOperatorRezervare proxyOperator= new ProxyOperatorRezervare(operator1, 4);
		proxyOperator.realizeazaRezervare(4);
		
		ProxyOperatorRezervare proxyOperator2= new ProxyOperatorRezervare(operator1, 4);
		proxyOperator2.realizeazaRezervare(2);
	}

}
