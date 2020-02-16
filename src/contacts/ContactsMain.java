package contacts;

import java.io.IOException;

import filesync.Filesync;
import ui.UI;

public class ContactsMain {

	public static void main(String[] args) throws IOException {
		UI.cb.addContact("Dan", "Dansson", "mail@mail", "031-435345345");
		UI.cb.run();
	//	ContactBook cb = new ContactBook();
		Filesync f = new Filesync();
		
		f.save();
		
	}
}
