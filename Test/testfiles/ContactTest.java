package testfiles;

import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

import contacts.Contact;

class ContactTest {

	@Test
	void TestContactsAreNotTheSame() {
		Contact kontakt1 = new Contact("Lars", "Roffel", "larsr@gmail.com", "101010");
		Contact kontakt2 = new Contact("Lars", "Ruffelito", "larsr@gmail.com", "101010");
		assertNotEquals(kontakt1, kontakt2);
}
}