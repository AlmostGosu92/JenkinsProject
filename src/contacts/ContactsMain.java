package contacts;

import java.io.IOException;

import ui.UI;

public class ContactsMain {

	public static void main(String[] args) throws IOException {
//		Filesync f = new Filesync();
		//Kontakter tillagda för testsyften

//		ContactBookSearch s = new ContactBookSearch();
		UI.cb.addContact("Dan", "Dansson", "mail@mail", "031-435345345");
		UI.cb.addContact("Jon", "Jonsson", "mail@mail", "031-435345345");
		UI.cb.addContact("Per", "Persson", "mail@mail", "031-435345345");
		UI.cb.addContact("Sven", "Svensson", "mail@mail", "031-435345345");
		UI.cb.addContact("Anders", "Andersson", "mail@mail", "031-435345345");
		UI.cb.addContact("Bertil", "Bertilsson", "mail@mail", "031-435345345");
		UI.cb.addContact("Arvid", "Arvidsson", "mail@mail", "031-435345345");
		UI.cb.addContact("Erik", "Eriksson", "mail@mail", "031-435345345");
		UI.cb.addContact("Josef", "Josefsson", "mail@mail", "031-435345345");
		UI.cb.addContact("Michael", "Michaelsson", "mail@mail", "031-435345345");
		UI.cb.addContact("Gustav", "Gustavsson", "mail@mail", "031-435345345");
		UI.cb.run();
		UI.f.save();
		UI.cb.addContact("Arne", "arnesson", "mail@mail", "031-28347242");
		System.out.println(UI.cbs.searchContact("arne"));

	//	ContactBook cb = new ContactBook();
		
//		f.save();
		
	}
}
