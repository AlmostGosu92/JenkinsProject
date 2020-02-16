package contacts;

import java.io.IOException;

import ui.UI;

public class ContactsMain {

	public static void main(String[] args) throws IOException {
//		Filesync f = new Filesync();
		UI.cb.addContact("Dan", "Dansson", "mail@mail", "031-435345345");
		UI.cb.run();
		UI.f.save();
	//	ContactBook cb = new ContactBook();
		
//		f.save();
		
	}
}
