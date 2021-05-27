package ro.ase.cts.seminar13.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.seminar13.clase.Grupa;
import ro.ase.cts.seminar13.clase.Student;

public class TestGrupaCuSetUp {
Grupa grupa;

	@Before
	public void setUp() throws Exception{
		grupa=new Grupa(1076);
		for(int i=0;i<35;i++) {
			Student student=new Student("Ana");
			student.adaugaNota(7);
			student.adaugaNota(8);
			student.adaugaNota(8);
			student.adaugaNota(8);
			student.adaugaNota(8);
			student.adaugaNota(8);
			student.adaugaNota(8);
			student.adaugaNota(9);
			grupa.adaugaStudent(student);			
		}
	}
	
	@Test(timeout=500)
	public void testPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
}
