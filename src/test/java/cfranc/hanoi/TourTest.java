package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {
	
	Disque d1 = new Disque(1);
	Disque d2 = new Disque(2);
	Disque d3 = new Disque(3);
	
	Tour t = new Tour(2);
	@Test
	public void Tour_NonVideEtDisquePlusPetit_True() {
		t.empiler(d3);
		boolean expected = true;
		boolean actual = t.empiler(d1);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void Tour_NonVideEtDisquePlusGrand_False() {
		t.empiler(d1);
		boolean expected = false;
		boolean actual = t.empiler(d3);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void TourVide_True() {
	
		boolean expected = true;
		boolean actual = t.empiler(d1);
		
		assertEquals(expected, actual);
	}
	
	public void TourPleine_False() {
		t.empiler(d3);
		t.empiler(d2);
		
		boolean expected = false;
		boolean actual = t.empiler(d1);
	}
	
}
