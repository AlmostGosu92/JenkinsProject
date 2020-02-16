package testfiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UITest {

	@Test
	void UISearchTest() {
		UI.cb.addContact("Lasse", "Schweinschteiger", "mail@mail", "03142227242");
		UI.cb.run();
		assertEquals(UI.cbs.searchContact("arne"), "Arne Bjarnesson, mail@mail, 031-28347242");
	}
	
	@Test
	void UIAdd1Contact() {
		UI.cb.addContact("Janne", "Klasson", "mail@mail", "031-283442442");
		UI.cb.run();
		assertEquals(UI.cb.contacts.size(), 1);
	}
	
	@Test
	public void UIRemove3Contacts() {
		UI.cb.addContact("Rolph", "Jenkins", "mail@mail", "031-2822242");
		UI.cb.removeContact(2);
		UI.cb.removeContact(1);
		UI.cb.removeContact(0);
		UI.cb.run();
		assertEquals(UI.cb.contacts.size(), 0);
	}

}
