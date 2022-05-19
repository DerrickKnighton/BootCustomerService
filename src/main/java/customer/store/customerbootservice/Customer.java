package customer.store.customerbootservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	public Customer() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	public String name;
	public String phoneNumber;
	public String dateOfBirth;
	
	public Customer(String Name, String PhoneNumber, String DateOfBirth) {
		
		this.name = Name;
		this.dateOfBirth = DateOfBirth;
		this.phoneNumber = PhoneNumber;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}	
	public Integer getId() {
		return this.id;
	}

}
