package contacts;

import java.util.ArrayList;

public class ContactBook implements ui.UI {
	public static ArrayList<Contact> contacts = new ArrayList<>();
	
	
	public void removeContact(int i) {
		contacts.remove(i);  // 0 skall ändras till den plats i indexet som markerats för borttag.
	}	
	
	public void addContact(String name, String lastName, String email, String number) {
	  contacts.add(new Contact(name, lastName, email ,number));
	}

//	@Override
//	public void run() {
//		
//	}
	
	
}

