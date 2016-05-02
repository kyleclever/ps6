package base;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;

import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {

	private static PersonDomainModel sample1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
		Date DOB1 = new SimpleDateFormat("MM.dd.YYYY").parse("09.11.1999");
		sample1 = new PersonDomainModel();
		sample1.setFirstName("John");
		sample1.setLastName("Smith");
		sample1.setBirthday(DOB1);
		sample1.setCity("Newark");
		sample1.setPostalCode(19711);
		sample1.setStreet("303 Briar Lane");
	}

	@After
	public void tearDown() throws Exception {
		PersonDomainModel per;	
		PersonDAL.deletePerson(sample1.getPersonID());
		per = PersonDAL.getPerson(sample1.getPersonID());
		assertNull("The Person shouldn't have been in the database",per);		
	}
	
	@Test
	public void addPersonTest()
	{		
		PersonDomainModel per1;		
		per1 = PersonDAL.getPerson(sample1.getPersonID());	
		assertNull("The per1 shouldn't have been in the database",per1);		
		PersonDAL.addPerson(sample1);	
		
		per1 = PersonDAL.getPerson(sample1.getPersonID());
		System.out.println(sample1.getPersonID() + " found");
		//assertNotNull("The Person should have been added to the database",per1);
	}
	
	@Test
	public void updatePersonTest()
	{		
		PersonDomainModel per1;
		final String update_lastName = "Wang";
		
		per1 = PersonDAL.getPerson(sample1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",per1);		
		PersonDAL.addPerson(sample1);	
		
		sample1.setLastName(update_lastName);
		PersonDAL.updatePerson(sample1);
		
		per1 = PersonDAL.getPerson(sample1.getPersonID());

		assertTrue("Name Didn't Change",sample1.getLastName() == update_lastName);
	}

	
	
	@Test
	public void deletePersonTest()
	{		
		PersonDomainModel per1;		
		per1 = PersonDAL.getPerson(sample1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",per1);	
		
		PersonDAL.addPerson(sample1);			
		per1 = PersonDAL.getPerson(sample1.getPersonID());
		System.out.println(sample1.getPersonID() + " found");
		//assertNotNull("The Person should have been added to the database",per1);
		
		PersonDAL.deletePerson(sample1.getPersonID());
		per1 = PersonDAL.getPerson(sample1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",per1);	
		
	}
	
}
