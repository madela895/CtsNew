package ro.ase.cts.seminar13.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.seminar13.clase.Grupa;
import ro.ase.cts.seminar13.clase.Student;


public class TestGrupa {
	Grupa grupa;
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
	
	//right bicep
	@Test
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<7;i++) {
			Student student=new Student("Adela");
			student.adaugaNota(2);
			student.adaugaNota(8);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) {
			Student student=new Student("Ioana");
			student.adaugaNota(10);
			student.adaugaNota(8);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.41, grupa.getPromovabilitate(),0.05);
	}
	
	@Test
	public void testPromovabilitateBoundaryInf() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<4;i++) {
			Student student=new Student("Adela");
			student.adaugaNota(2);
			student.adaugaNota(3);
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	public void testPromovabilitateBoundarySup() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<4;i++) {
			Student student=new Student("Ana");
			student.adaugaNota(7);
			student.adaugaNota(8);
			student.adaugaNota(9);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPromovabilitateError() {
		Grupa grupa=new Grupa(1076);
		grupa.getPromovabilitate();		
	}
	
	
}
