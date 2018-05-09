import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTutorial001 {

	@Test
	/*
	public void test() {
		fail("Not yet implemented");
	}
	*/
	
	public void testAdd() {
		String str = "Junit is working fine";
		assertEquals ("Junit is working fine",str);
	}

}
