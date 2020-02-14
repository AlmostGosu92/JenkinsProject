package testfiles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

import contacts.Contact;
import contacts.ContactBook;

class ContactBookTest {
	
	ContactBook cb = new ContactBook();
	Contact kontakt1 = new Contact("Lars", "Roflsson", "hej@gmeul.com", "73827318");

	@Test
	public void TestContactIsAdded() {
		cb.addContact("Lars", "Roflsson", "hej@gmeul.com", "73827318");
		assertNotEquals(cb.contacts.get(0), kontakt1);
	}
	
	
//	@Test
//	public void TestContactIsRemoved() {
//		cb.removeContact("Lars", "Roflsson", "hej@gmeul.com", "73827318");
//		assertEquals(cb.contacts.get(1), kontakt1);
//	}	

}
