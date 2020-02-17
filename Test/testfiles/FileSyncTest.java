package testfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import contacts.ContactBook;
import filesync.Filesync;

public class FileSyncTest {

	Filesync f = new Filesync();

	@Test
	void LoadTest() throws IOException {
		ContactBook c = new ContactBook();

			c.contacts.clear();
			f.setFilnamn("Test.txt");
			BufferedWriter out = new BufferedWriter(new FileWriter(f.getFilnamn()));
			out.write("Test Testsson Test@test.test 08-434343");
			out.close();
			f.Load();
			assertEquals(c.contacts.get(0).getLastName(), "Testsson");
			c.contacts.clear();
		

	}

	@Test
	void SaveTest() throws IOException {

			
			ContactBook c = new ContactBook();
			c.contacts.clear();
			c.addContact("Peter", "Petersson", "peter@hotmail.com", "070-9367431");
			c.addContact("Eric", "Ericsson", "eric@hotmail.com", "08-4343435");
			f.setFilnamn("saveTest.txt");
			f.save();
			int tokens = 0;
			File file = new File(f.getFilnamn());
			Scanner scan = new Scanner(file);
			while (scan.hasNext() == true) {

				tokens++;
				scan.next();

			}

			assertEquals(8, tokens);
			c.contacts.clear();
		

	}
}
