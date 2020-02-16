package filesync;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import contacts.Contact;
import contacts.ContactBook;





public class Filesync {

	ContactBook b = ui.UI.cb;
	
	private String filnamn = "kontaktlista.txt";

	public String getFilnamn() {
		return filnamn;
	}

	public void setFilnamn(String filnamn) {
		this.filnamn = filnamn;
	}
	
	public void Load() throws FileNotFoundException {
		
		File file = new File(filnamn);
		Scanner radraknare = new Scanner(file);
		Scanner sc = new Scanner(file);
		int antalRader = 0;
//		räknar antalet rader i filen
		while (radraknare.hasNextLine()) {
			antalRader++;
			radraknare.nextLine();
		}
//		läser av alla parametrar i constructorn per rad
		for (int i = 0; i < antalRader; i++) {
			b.contacts.add(new Contact(sc.next(), sc.next(), sc.next(), sc.next()));
			sc.hasNextLine();

		}
		

	}
	public void save() throws IOException {
		
		BufferedWriter out = new BufferedWriter(new FileWriter(filnamn));
		for (int i = 0; i < b.contacts.size(); i++) {
			out.write(b.contacts.get(i).getName() + " ");
			out.write(b.contacts.get(i).getLastName() + " ");
			out.write(b.contacts.get(i).getMail() + " ");
			out.write(b.contacts.get(i).getNumber() + " ");
			out.newLine();

		}

		out.close();


	}
}