package filesync;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Filesync {

	public void Load() throws FileNotFoundException {
		File file = new File("kontaktlista.txt");
		Scanner radraknare = new Scanner(file);
		Scanner sc = new Scanner(file);
		int antalRader = 0;
//		räknar antalet rader i filen
		while(radraknare.hasNextLine()) {
			antalRader++;
			radraknare.nextLine();
		}
//		läser av alla parametrar i constructorn per rad
		for (int i = 0; i < antalRader; i++) {
			namn.add(new Contacts(sc.next(), sc.next(), sc.next()));
			sc.hasNextLine();

		}

	}
}
