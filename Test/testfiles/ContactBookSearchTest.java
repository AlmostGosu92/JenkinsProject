package testfiles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contacts.ContactBookSearch;
import ui.UI;

class ContactBookSearchTest {

	@Test
	void SearchForMissingContactTest() {
		ContactBookSearch search = new ContactBookSearch();
		assertEquals(search.searchContact("Arne"), "Contact not found");
	}	@Test
	void SearchForExistingContactTest2() {
		UI.cb.addContact("Arne", "Bjarnesson", "mail@mail", "031-28347242");
		UI.cb.run();
		assertEquals(UI.cbs.searchContact("arne"), "Arne Bjarnesson, mail@mail, 031-28347242");
	}	@Test
	void SearchForExistingContactTest3() {
		UI.cb.addContact("Arne", "Bjarnesson", "mail@mail", "031-28347242");
		UI.cb.addContact("Jonas", "Bengtsson", "mail@mail", "031-28347242");
		UI.cb.run();
		assertEquals(UI.cbs.searchContact("jonas"), "Jonas Bengtsson, mail@mail, 031-28347242");
	}

}
