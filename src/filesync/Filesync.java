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

	ContactBook b = ui.GUI.cb;
	
//	Variabel för filnamnet. Den är kontaktlista.txt default. Getters och setters används främst för att byta fil i 
//	tester så att inte kotaklista skrivs över av save-metoden i testerna.
	private String filnamn = "kontaktlista.txt";

	public String getFilnamn() {
		return filnamn;
	}

	public void setFilnamn(String filnamn) {
		this.filnamn = filnamn;
	}
	
	
//	Load läser in alla rader ifrån txtfilen och skapar en ny kontakt för varje rad.
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
	
//	Save-metoden skapar en fil som heter kontaklista.txt och skriver ut alla element i bjekten i listan.
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