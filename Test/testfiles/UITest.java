package testfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ui.GUI;


class UITest {

	@Test
	void UISearchTest() {
		GUI.cb.addContact("Lasse", "Schweinschteiger", "mail@mail", "03142227242");
		GUI.cb.runGUI();
		assertEquals(GUI.cbs.searchContact("lasse"), "Lasse Schweinschteiger, mail@mail, 03142227242");
		GUI.cb.contacts.clear();
	}
	
	@Test
	void UIAdd1Contact() {
		GUI.cb.contacts.clear();
		GUI.cb.addContact("Janne", "Klasson", "mail@mail", "031-283442442");
		GUI.cb.runGUI();
		assertEquals(GUI.cb.contacts.size(), 1);
		GUI.cb.contacts.clear();
	}
	
	@Test
	public void UIRemove3Contacts() {
		GUI.cb.contacts.clear();
		GUI.cb.addContact("Rolph", "Jenkins", "mail@mail", "031-2822242");
		GUI.cb.addContact("Janne", "Klasson", "mail@mail", "031-283442442");
		GUI.cb.addContact("Lasse", "Schweinschteiger", "mail@mail", "03142227242");
		GUI.cb.removeContact(2);
		GUI.cb.removeContact(1);
		GUI.cb.removeContact(0);
		GUI.cb.runGUI();
		assertEquals(GUI.cb.contacts.size(), 0);
		GUI.cb.contacts.clear();
	}

}
