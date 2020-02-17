package testfiles;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import contacts.Contact;
import contacts.ContactBook;

class ContactTest {

	@Test
	void TestContactsNameCorrect() {
		Contact kontakt1 = new Contact("Lars", "Roffel", "larsr@gmail.com", "101010");
		assertEquals(kontakt1.getName(), "Lars");
		
}
	@Test
	void TestContactsNameNotCorrect() {
		Contact kontakt1 = new Contact("Lars", "Roffel", "larsr@gmail.com", "101010");
		assertNotEquals(kontakt1.getName(), "Klasse");
}	
	@Test
	void TestContactsMailCorrect() {
		Contact kontakt1 = new Contact("Lars", "Roffel", "larsr@gmail.com", "101010");
		assertEquals(kontakt1.getMail(), "larsr@gmail.com");
}
	
	@Test
	void TestContactsMailNotCorrect() {
		Contact kontakt1 = new Contact("Lars", "Roffel", "larsr@gmail.com", "101010");
		assertNotEquals(kontakt1.getName(), "felmailadress@gmail.com");
}
}