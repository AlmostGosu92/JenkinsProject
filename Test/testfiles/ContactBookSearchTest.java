package testfiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contacts.ContactBookSearch;
import ui.GUI;

class ContactBookSearchTest {

	@Test
	void SearchForMissingContactTest() {
		ContactBookSearch search = new ContactBookSearch();
		assertEquals(search.searchContact("Arne"), "Contact not found");
	}	@Test
	void SearchForExistingContactTest() {
		GUI.cb.addContact("Arne", "Bjarnesson", "mail@mail", "031-28347242");
		GUI.cb.runGUI();
		assertEquals(GUI.cbs.searchContact("arne"), "Arne Bjarnesson, mail@mail, 031-28347242");
	}	@Test
	void SearchForExistingContactTest2() {
		GUI.cb.addContact("Arne", "Bjarnesson", "mail@mail", "031-28347242");
		GUI.cb.addContact("Jonas", "Bengtsson", "mail@mail", "031-28347242");
		GUI.cb.runGUI();
		assertEquals(GUI.cbs.searchContact("jonas"), "Jonas Bengtsson, mail@mail, 031-28347242");
	}

}
