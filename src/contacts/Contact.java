package contacts;

public class Contact {
	
	String name, mail, number;
	
	public Contact(String name, String mail, String number) {
		this.name = name;
		this.mail = mail;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
//	*Kod för sökmetod
//	for (Contact contact : ConList) {
//		if (in.equals(contact.getName()){
//			return contact;
//		}
//		else if (in.equals(contact.getMail)) {
//			return contact;
//		}
//		else if (in.equals(contact.getNumber)) {
//			return contact;
//		}
//	}
//	return "Contact not found";

}
