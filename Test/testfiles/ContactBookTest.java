package testfiles;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import contacts.ContactBook;

class ContactBookTest {
	

	@Test
	public void TestContactIsAdded() {
		ContactBook cb = new ContactBook();
		cb.addContact("Lars", "roFFel", "hej@gmail.com", "2123123");
		assertEquals(cb.contacts.size(), 1);
		cb.contacts.clear();
	}
	
	
	@Test
	public void TestTwoContactsAreAdded() {
		ContactBook cb = new ContactBook();
		cb.addContact("Lars", "roFFel", "hej@gmail.com", "2123123");
		cb.addContact("Lars", "ruFFel", "haj@gmail.com", "23213123");
		assertEquals(cb.contacts.size(), 2);
		cb.contacts.clear();
	}
	
	@Test
	public void TestRemove1Contact() {
		ContactBook cb = new ContactBook();
		cb.addContact("Lars", "roFFel", "hej@gmail.com", "2123123");
		cb.addContact("Lars", "ruFFel", "haj@gmail.com", "23213123");
		cb.removeContact(1);
		assertEquals(cb.contacts.size(), 1);
		cb.contacts.clear();
	}
	
	@Test
	public void TestRemove2Contact() {
		ContactBook cb = new ContactBook();
		cb.addContact("Lars", "roFFel", "hej@gmail.com", "2123123");
		cb.addContact("Lars", "ruFFel", "haj@gmail.com", "23213123");
		cb.removeContact(1);
		cb.removeContact(0);
		assertEquals(cb.contacts.size(), 0);
		cb.contacts.clear();
	}

}
