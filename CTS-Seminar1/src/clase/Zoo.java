package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Zookeeper zookeeper;
    private List<Animal> listaAnimale;
    
    
	public Zoo(Zookeeper zookeeper, List<Animal> listaAnimale) {
		super();
		this.zookeeper = zookeeper;
		this.listaAnimale = listaAnimale;
	}


	public Zoo() {
		super();
		
		this.zookeeper=new Zookeeper("Ion");
		this.listaAnimale=new ArrayList<>();
	}
	
	
    
	public Zookeeper getZookeeper() {
		return zookeeper;
	}


	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}


	public List<Animal> getListaAnimale() {
		return listaAnimale;
	}


	public void setListaAnimale(List<Animal> listaAnimale) {
		this.listaAnimale = listaAnimale;
	}


	public void adaugareAnimal(Animal a) {
		this.listaAnimale.add(a);
	}
	
	public void hranesteAnimale() {
		for(Animal a: listaAnimale) {
			zookeeper.feed(a);
		}
	}
    
}
