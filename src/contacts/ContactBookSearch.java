package contacts;

import ui.UI;

public class ContactBookSearch  {
	

	public String searchContact(String string) {
		
		for (Contact contact : UI.cb.contacts) {
		if (string.equalsIgnoreCase(contact.getName())){
			return contact.getName() + " " + contact.getLastName() + ", " + contact.getMail() + ", " + contact.getNumber();
		}
		else if (string.equalsIgnoreCase(contact.getLastName())) {
			return contact.getName() + " " + contact.getLastName() + ", " + contact.getMail() + ", " + contact.getNumber();
		}
		else if (string.equalsIgnoreCase(contact.getMail())) {
			return contact.getName() + " " + contact.getLastName() + ", " + contact.getMail() + ", " + contact.getNumber();
		}
		else if (string.equalsIgnoreCase(contact.getNumber())) {
			return contact.getName() + " " + contact.getLastName() + ", " + contact.getMail() + ", " + contact.getNumber();
		}
	}
	return "Contact not found";
		
	}

}
