package addressBook;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class AddressBook extends Entry{
	public Set<Entry> entries = new HashSet<Entry>();
//	public ArrayList<Entry> entries = new ArrayList<Entry>();
	
	public AddressBook() {
		super();
	}
	
//HashMap Code
	public void addEntry(Entry entry) {
		entries.add(entry);
		System.out.println("Entry added! \n");
	}
	
	public void removeEntry(String searchEmail) {
		for (Entry entry : entries) {
			if (entry.getEmail().equals(searchEmail)) {
				System.out.println("Are you sure you want to delete the following contact? (Please type \"y\" for yes and \"n\" for no.)");
				System.out.println(entry);
				Scanner input = new Scanner(System.in);
				String response = input.nextLine();
				if (response.equals("y")) {
					entries.remove(entry);
					System.out.println("This contact has been deleted:" + entry);
				} 
			} 
			else {
				System.out.println("Contact not found.");
			}
		}
	}
	
	
	public void searchByFirstName(String searchFirstName) {
		for (Entry entry : entries) {
			if (entry.getFirstName().contains(searchFirstName)) {
				System.out.println(entry);
			} else {
				System.out.println("No matching contact found.");
			}
		}
	}
	
	public void searchByLastName(String searchLastName) {
		for (Entry entry : entries) {
			if (entry.getLastName().contains(searchLastName)) {
				System.out.println(entry);
			} else {
				System.out.println("No matching contact found.");
			}
		}
	}
	
	public void searchByPhoneNumber(String searchPhoneNumber) {
		for (Entry entry : entries) {
			if (entry.getPhoneNumber().contains(searchPhoneNumber)) {
				System.out.println(entry);
			} else {
				System.out.println("No matching contact found.");
			}
		}
	}
	
	public void searchByEmailAddress(String searchEmailAddress) {
		for (Entry entry : entries) {
			if (entry.getEmail().contains(searchEmailAddress)) {
				System.out.println(entry);
			} else {
				System.out.println("No matching contact found.");
			}
		}
	}

	
	public void printAddressBook() {
		if (entries.size() > 0) {
			System.out.println("Contacts in address book:");
			System.out.println(entries);
		} else {
			System.out.println("No contacts in address book.\n");
		}
	}
	
	public void deleteAddressBook() {
		int i = 0;
		while (i != -1) {
			System.out.println("Are you sure you want to delete the entire address book? (Please enter \"y\" for yes or \"n\" for no.)");
			Scanner input = new Scanner(System.in);
			String delete = input.next();
			
			switch (delete) {
				case "y":
					entries.clear();
					System.out.println("Address book deleted.");
					i = -1;
					break;
				case "n":
					i = -1;
					break;
				default:
					System.out.println("Please make a valid selection.");
					i = 0;
			}
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(entries);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressBook other = (AddressBook) obj;
		return Objects.equals(entries, other.entries);
	}
	
	public static void main(String[] args) {
//		Create address book that contains an ArrayList of entries		
		AddressBook addressBook = new AddressBook();
		
		int i = 0;
		while (i != -1) {
	//		Prompt user for input
			System.out.println("Please choose what you'd like to do with the database. \n"
					+ "1. Add an entry. \n"
					+ "2. Remove an entry \n"
					+ "3. Search for a specific entry \n"
					+ "4. Print address book. \n"
					+ "5. Delete book. \n"
					+ "6. Quit");
			
			Scanner input = new Scanner(System.in);
			int action = Integer.parseInt(input.nextLine());
			
			switch (action) {
				case 1: 
	//			  	Collect contact info from user
					Entry newEntry = new Entry();
					System.out.println("Enter first name.");
					String firstName = input.nextLine();
					newEntry.setFirstName(firstName);
					
					System.out.println("Enter last name.");
					String lastName = input.nextLine();
					newEntry.setLastName(lastName);
					
					System.out.println("Enter phone number.");
					String phoneNumber = input.nextLine();
					newEntry.setPhoneNumber(phoneNumber);
					
					System.out.println("Enter email address.");
					String email = input.nextLine();
					newEntry.setEmail(email);
					
					addressBook.addEntry(newEntry);
					break;
				case 2:
					System.out.println("Please enter email address to find contact.");
					String searchEmail = input.nextLine();
					addressBook.removeEntry(searchEmail);
					break;
				case 3:
					System.out.println("How would you like to search contacts? (Enter number)"
							+ "\n1. First Name"
							+ "\n2. Last Name"
							+ "\n3. Phone Number"
							+ "\n4. Email Address");
					String searchBy = input.nextLine();
						switch (searchBy) {
							case "1":
								System.out.println("Enter first name.");
								String searchFirstName = input.nextLine();
								addressBook.searchByFirstName(searchFirstName);
								break;
							case "2":
								System.out.println("Enter last name.");
								String searchLastName = input.nextLine();
								addressBook.searchByLastName(searchLastName);
								break;
							case "3":
								System.out.println("Enter phone number.");
								String searchPhoneNumber = input.nextLine();
								addressBook.searchByPhoneNumber(searchPhoneNumber);
								break;
							case "4":
								System.out.println("Enter email address.");
								String searchEmailAddress = input.nextLine();
								addressBook.searchByEmailAddress(searchEmailAddress);
								break;
							default:
								System.out.println("Invalid selection.");
						}
					
					break;
				case 4:
					addressBook.printAddressBook();
					break;
				case 5:
					addressBook.deleteAddressBook();
					break;
				case 6:
					System.out.println("Thank you!");
					i = -1;
					break;
				default:
					System.out.println("Invalid selection.\n");
					i = 0;
			}
		}
	}
}


	
