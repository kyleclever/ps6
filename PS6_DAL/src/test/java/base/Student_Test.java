package base;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.StudentDomainModel;



public class Student_Test {

	private static StudentDomainModel sample2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
		Date DOB2 = new SimpleDateFormat("MM.dd.YYYY").parse("10.11.2010");
//		//sample2 = new StudentDomainModel();
//		sample2.setFirstName("David");
//		sample2.setMiddleName("Anne");
//		sample2.setLastName("Kim");
//		sample2.setDOB(DOB2);

	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}

}
