package contacts;

import java.util.ArrayList;

public class ContactBook {
	
	public ArrayList<Contact> contacts = new ArrayList<>();
	
	
	public void removeContact(String name, String lastName, String email, String number) {
		contacts.remove(0);  // 0 skall ändras till den plats i indexet som markerats för borttag.
	}	
	
	public void addContact(String name, String lastName, String email, String number) {
	  contacts.add(new Contact(name, lastName, email ,number));
	}
	
	
}

