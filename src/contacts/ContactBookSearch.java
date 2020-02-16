package contacts;

import ui.UI;

public class ContactBookSearch  {
	

	public String searchContact(String string) {
		
		for (Contact contact : UI.cb.contacts) {
		if (string.equals(contact.getName())){
			return contact.getName() + " " + contact.getLastName() + " " + contact.getMail() + " " + contact.getNumber();
		}
		else if (string.equals(contact.getLastName())) {
			return contact.getName() + " " + contact.getLastName() + " " + contact.getMail() + " " + contact.getNumber();
		}
		else if (string.equals(contact.getMail())) {
			return contact.getName() + " " + contact.getLastName() + " " + contact.getMail() + " " + contact.getNumber();
		}
		else if (string.equals(contact.getNumber())) {
			return contact.getName() + " " + contact.getLastName() + " " + contact.getMail() + " " + contact.getNumber();
		}
	}
	return "Contact not found";
		
	}

}
