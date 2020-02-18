package contacts;

public class Contact {
	
//Nedan är en konstruktor med tillhörande getters & setters,
//med Strings på name, lastname, mail och number.	
	
	String name, lastName, mail, number;
	
	public Contact(String name, String lastName, String mail, String number) {
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	@Override
	public String toString() {
		return name + " " + lastName + ", " + number + ", " + mail;
	}

}
