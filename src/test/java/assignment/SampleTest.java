package assignment;

import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class SampleTest {

	//@org.junit.Test
	public void setUp() {
		Student student1 = new Student("Alan Fitzpatrick", 17 / 01 / 1998, 22, 12345);
		Student student2 = new Student("Willy Joe Padden", 17 / 01 / 1980, 40, 11111);

		Course engineering = new Course("Engineering", new LocalDate(2020, 9, 28), new LocalDate(2020, 12, 10));
		Course arts = new Course("Arts", new LocalDate(2020, 9, 30), new LocalDate(2020, 12, 15));

		Module calculus = new Module("Calculus", 12345);
		Module cad = new Module("CAD", 67891);
		Module pysch = new Module("Pyschology", 56567);
		Module geog = new Module("Geography", 87879);

		 arts.addModule(geog);
		 arts.addModule(pysch);
		 engineering.addModule(cad);
		 engineering.addModule(calculus);
		
		 student2.addCourse(arts);
		 student1.addCourse(engineering);

		System.out.println(student2.getUsername());
		System.out.println(arts.getStartDate());
		System.out.println(engineering.getEndDate());

	}

	@Test
	public void getID() {
		System.out.println("Get ID");
		Student student1 = new Student("Alan Fitzpatrick", 17 / 01 / 1998, 22, 12345);
		int expResult = 12345;
		int result = student1.getID();
		assertEquals(expResult, result);
	}

	@Test
	public void testGetName() {
		System.out.println("getName");
		Student student2 = new Student("Willy Joe Padden", 17 / 01 / 1980, 40, 11111);
		String expResult = "Willy Joe Padden";
		String result = student2.getName();
		assertEquals(expResult, result);
	}

	@Test
	public void getUsername() {
		System.out.println("Get Username");
		Student student1 = new Student("Alan Fitzpatrick", 17 / 01 / 1998, 22, 12345);
		String expResult = "Alan Fitzpatrick22";
		String result = student1.getUsername();
		assertEquals(expResult, result);
	}
	
	@org.junit.Test
    public void addModule() {
		System.out.print("addModule test");
		Course engineering = new Course("Engineering", new LocalDate(2020, 9, 28), new LocalDate(2020, 12, 10));
		Module calculus = new Module("Calculus", 12345);
        engineering.addModule(calculus);                    
        assertEquals(calculus,engineering.getModules().get(0));    
    }

}
