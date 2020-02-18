package contacts;

import ui.GUI;

public class ContactBookSearch  {
	
// en sök-metod med forloop, som letar igenom arraylisten contacts efter det sordet i name, lastname, mail och number.
	public String searchContact(String string) {
		
		for (Contact contact : GUI.cb.contacts) {
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
// returnerar "contact not found" ifall ingen kontakt innehåller sökordet.	
		
	}

}
