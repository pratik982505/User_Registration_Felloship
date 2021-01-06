package testing;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterisedTest {
	private String input;
	private boolean expected = true;

	UserRegisration1 userRegisration = new UserRegisration1();

	public ParameterisedTest(String input) {
		this.input = input;
		//this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com"}, { "abc-100@yahoo.com"},
				{ "abc.100@yahoo.com" }, { "abc111@abc.com"}, { "abc.100@abc.com.au"},
				{ "abc@gmail.com"}, { "abc@gmail.com.com" }, { "abc+100@gmail.com"} });
	}

	@Test
	public void testUserFirstName() {
		assertEquals(expected, userRegisration.email(input));
	}
}

