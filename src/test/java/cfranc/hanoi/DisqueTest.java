package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	int tallD = 3;
	int smallD = 1;
	Disque dSmall = new Disque(smallD);
	Disque dTall = new Disque(tallD);
	
	@Test
	public void testCompareTo_PetitComapreToGrand_negative1() {
		int expected = -1;
		int actual = dSmall.compareTo(dTall);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCompareTo_GrandComapreToPetit_positive1() {
		int expected = 1;
		int actual = dTall.compareTo(dSmall);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCompareTo_DiametreEgaux_0() {
		Disque dTall2 = new Disque(tallD);
		int expected = 0;
		int actual = dTall.compareTo(dTall2);
		
		assertEquals(expected, actual);
	}
	
	

}
