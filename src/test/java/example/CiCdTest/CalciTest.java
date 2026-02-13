package example.CiCdTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalciTest {

	@Test
	void addTest() {
		Calci obj=new Calci();
		assertEquals(87, obj.add(85, 2));
	}
	
	@Test
	void multipyTest() {
		Calci obj=new Calci();
		assertEquals(2, obj.multipy(2, 1));
		
	}
}
