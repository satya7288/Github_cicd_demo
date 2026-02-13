package example.CiCdTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalciTest {

	@Test
	void addTest() {
		Calci obj=new Calci();
		assertEquals(10, obj.add(8, 2));
	}
	
	@Test
	void multipyTest() {
		Calci obj=new Calci();
		assertEquals(0, obj.multipy(2, 0));
		
	}
}
