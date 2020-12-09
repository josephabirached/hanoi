package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	
	Disque d1 = new Disque(1);
	Disque d2 = new Disque(2);
	
	@Test
	/*
	 * GIVEN_WHEN_THEN
	 */
	public void testEmpiler_TourPleine_FALSE() {

		Tour _tourPleine = new Tour(1);
		_tourPleine.empiler(d2);
		
		boolean expected = false;
		boolean actual = _tourPleine.empiler(d1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	/*
	 * GIVEN_WHEN_THEN
	 */
	public void testEmpiler_TourNonVideDisquePlusPetit_TRUE() {
		
		Tour _tourNonVide = new Tour(3);
		_tourNonVide.empiler(d2);
		
		
		boolean expected = true;
		boolean actual = _tourNonVide.empiler(d1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	/*
	 * GIVEN_WHEN_THEN
	 */
	public void testEmpiler_TourVide_TRUE() {
		Tour _tourVide = new Tour(1);
		
		boolean expected = true;
		boolean actual = _tourVide.empiler(d1);
		
		assertEquals(expected,actual);
	}
	
	@Test
	/*
	 * GIVEN_WHEN_THEN
	 */
	public void testEmpiler_TourNonVideDisquePlusGrand_FALSE(){
		
		Tour _tourNonVide = new Tour(3);
		_tourNonVide.empiler(d1);
		
		
		boolean expected = false;
		boolean actual = _tourNonVide.empiler(d2);
		
		assertEquals(expected, actual);
	}
	
}
