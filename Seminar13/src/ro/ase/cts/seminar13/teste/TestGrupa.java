package ro.ase.cts.seminar13.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.seminar13.clase.Grupa;

public class TestGrupa {
// right bicep
	@Test
	public void testConstructorRight() {
		Grupa grupa=new Grupa(1076);
		assertEquals(1076, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundaryInf(){
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundarySup(){
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testConstructorError() {
		Grupa grupa=new Grupa(1200);
	}
	
	@Test(expected =IllegalArgumentException.class)
	public void testConstructorErrorSub1000() {
		Grupa grupa=new Grupa(900);
	}
	
	@Test(timeout=500)
	public void testConstructorPerformance() {
		Grupa grupa=new Grupa(1076);
	}
	
	//correct
	//range- 5 teste(1076,1000,1100,1200,900)
	
	@Test
	public void testConstructorExistaLista() {
		Grupa grupa=new Grupa(1076);
		assertNotNull(grupa.getStudenti());
	}
	
	
}
