package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTests {
	Student student=null;
	
	@Before 
	public void setUp() {
		student=new Student();
	}

	@Test
	public void testApelConstructorCuParamentru() {
		String nume="Ion";
		Student student=new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testApelConstructorFaraParametru() {
		String nume="Student";
		Student student=new Student();
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareListaConstructorfaraParam() {
		//Student student=new Student();
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareNotaInLista() {
		//Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testMarimeListaCorecta() {
		//Student student=new Student();
		int nota=7;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testModificareCorectaNume() {
		//Student student=new Student();
		String nume="popescu";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
		
	}
	
	@Test
	public void testVerificaMedia() {
		student.adaugaNota(7);
		student.adaugaNota(8);
		assertEquals(7.5, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testCalculMedieFaraNote() {
		assertEquals(0, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testCalculMedieUnElement() {
		student.adaugaNota(6);
		assertEquals(6, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testVerificareRestante() {
		int nota1=4;
		int nota2=6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificareNuAreRestante() {
		int nota1=7;
		int nota2=6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testVerificareRestanteFaraNote() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testVerificareAruncareExceptie() {
		int index=-1;
		student.getNota(index);
	}

}
