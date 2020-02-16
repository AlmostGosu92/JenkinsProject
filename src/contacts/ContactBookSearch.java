package contacts;

import ui.UI;

public class ContactBookSearch  {
	

	public String searchContact(String string) {
		
		for (Contact contact : UI.cb.contacts) {
		if (contact.getName().toLowerCase().contains(string)){
			return contact.getName() + " " + contact.getLastName() + ", " + contact.getMail() + ", " + contact.getNumber();
		}
		else if (contact.getLastName().toLowerCase().contains(string)) {
			return contact.getName() + " " + contact.getLastName() + ", " + contact.getMail() + ", " + contact.getNumber();
		}
		else if (contact.getMail().toLowerCase().contains(string)) {
			return contact.getName() + " " + contact.getLastName() + ", " + contact.getMail() + ", " + contact.getNumber();
		}
		else if (contact.getNumber().toLowerCase().contains(string)) {
			return contact.getName() + " " + contact.getLastName() + ", " + contact.getMail() + ", " + contact.getNumber();
		}
	}
	return "Contact not found";
		
	}

}
