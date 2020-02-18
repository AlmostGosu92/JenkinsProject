package contacts;

import java.util.ArrayList;

public class ContactBook implements ui.GUI {
	
	//arraylist där alla kontakter lagras
	public static ArrayList<Contact> contacts = new ArrayList<>();
	
	//metod för borttag av kontakter.
	public void removeContact(int i) {
		contacts.remove(i); 
	}	
	//metod för tillägg av nya kontakter, fyller på arraylisten contacts med hjälp av Contact-konstruktorn. 
	public void addContact(String name, String lastName, String email, String number) {
		contacts.add(new Contact(name, lastName, email ,number));
	}
	
}

