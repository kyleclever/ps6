package domain;

import java.util.Date;
//import java.time.LocalDate;
import java.util.UUID;
//import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
//import util.LocalDateAdapter;
//import javafx.beans.property.ObjectProperty;

public class PersonDomainModel {

	private String firstName;
	private String lastName;
	private String street;
	private Integer postalCode;
	private String city;
	// private ObjectProperty<LocalDate> birthday;
	private Date birthday;
	private UUID PersonID;

	/**
	 * Default constructor.
	 */
	public  PersonDomainModel()
	{
		PersonID = UUID.randomUUID();
	}

	public UUID getPersonID() {
		return this.PersonID;
	}

	public void setPersonID(UUID PersonID) {
		this.PersonID = UUID.randomUUID();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// @XmlJavaTypeAdapter(LocalDateAdapter.class)
	// public LocalDate getBirthday() {
	// return birthday.get();
	// }
	//
	// public void setBirthday(LocalDate birthday) {
	// this.birthday.set(birthday);
	// }
	// public ObjectProperty<LocalDate> birthdayProperty(){
	// return birthday;
	// }

	public Date getBirthday() {
		
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}