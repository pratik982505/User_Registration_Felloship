package testing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestFName {
	@Test
	public void testFirstName() {
		UserRegisration1 add = new UserRegisration1();
		boolean output = add.firstName("Aiket");
		assertTrue(output);
	}
	
	@Test
	public void testLatName() {
		UserRegisration1 add = new UserRegisration1();
		boolean output = add.lastName("Gujar");
		assertTrue(output);
	}
	
	@Test
	public void testEmailId() {
		UserRegisration1 add = new UserRegisration1();
		boolean output = add.email("anniketgujar9524@gamil.com");
		assertTrue(output);
	}
	
	/*@Test
	public void testMobile() {
		UserRegisration add = new UserRegisration();
		boolean output = add.mobileNumber(1234567890);
		assertTrue(output);
	}*/
	
	@Test
	public void testPassword(String password) {
		UserRegisration1 passwrd = new UserRegisration1();
		boolean output = passwrd.password("As@3adfags");
		assertTrue(output);
	}
}
