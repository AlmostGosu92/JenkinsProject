package testfiles;







import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import contacts.ContactBook;
import filesync.Filesync;



public class FileSyncTest {

	Filesync f = new Filesync();
	

	
	@Test
	void LoadTest() {
		
	}
	
	@Test
	void SaveTest() throws IOException {
		ContactBook c = new ContactBook();
		c.addContact("Peter", "Petersson", "peter@hotmail.com", "070-9367431");
		c.addContact("Eric", "Ericsson", "eric@hotmail.com", "08-4343435");
		System.out.println(c.contacts.size());
		f.save();
		int tokens = 0;
		File file = new File("kontaktlista.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine() == true) {
			
			tokens++;
			scan.nextLine();
		
		}
		System.out.println(c.contacts.get(0).getName());
		assertEquals(2, tokens);
		
		
		
	}
}
