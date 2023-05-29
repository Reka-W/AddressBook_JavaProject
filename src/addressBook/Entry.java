package addressBook;

public class Entry {
//	instance variables
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	
//	Getters & Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

//	Constructor
	@Override
	public String toString() {
		return "\nFirst Name: " + getFirstName() 
			   + "\nLast Name: " + getLastName()
			   + "\nPhone Number: " + getPhoneNumber()
			   + "\nEmail: " + getEmail()
			   + "\n-----------------------------------";
	}
	
//  Creates a new Entry 	
	public Entry() {
		firstName = "John";
		lastName = "Doe";
		phoneNumber = "444-555-6677";
		email = "contact@gmail.com";
	}
	
	public Entry (String firstName, String lastName, String phoneNumber, String email) {
		firstName = this.getFirstName();
		lastName = this.getLastName();
		phoneNumber = this.getPhoneNumber();
		email = this.getEmail();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.phoneNumber = phoneNumber;
//		this.email = email;
	}
	
	public static void main(String[] args) {

//		Entry example = new Entry("Reka", "Walkup", "704-582-3808", "rekawalkup@gmail.com");
//		Entry example2 = new Entry("Scott", "Dossey", "555-555-3333", "scottdossey@gmail.com");

		}

	}

