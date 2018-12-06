package maventest;

import static org.junit.Assert.*;

import org.junit.Test;

public class lower2Uppertest {

//	my test case
	@Test
	public void test() {
		String actual = "balaji";
		String expected = "BALAJI";
		assertEquals(expected,lower2Upper.lower2UpperStr(actual));
	}

}
