package ro.ase.cts.program;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.clase.Reteta;

public class Main {
public static void Main(String[] args) {
	List<String> solutii=new ArrayList<>();
	solutii.add("apa");
	List<Integer> cantitati=new ArrayList<>();
	cantitati.add(10);
	Reteta reteta1= new Reteta(solutii,cantitati);
	Reteta reteta2= (Reteta)reteta1.copiaza();
	
	System.out.println(reteta1);
	System.out.println("-----------");
	System.out.println(reteta2);
}
}
