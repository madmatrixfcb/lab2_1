package lab2_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class ElementyTest {

	@Test
	public void PierwszyElementTest() {
		int key = 2;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertEquals(0, wynikWyszukiwania.getPosition());
		assertTrue(wynikWyszukiwania.isFound());
	}

	@Test
	public void SrodkowyElementTest() {
		int key = 5;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertEquals(1, wynikWyszukiwania.getPosition());
		assertTrue(wynikWyszukiwania.isFound());
	}
	
	@Test
	public void OstatniElementTest() {
		int key = 7;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertEquals(2, wynikWyszukiwania.getPosition());
		assertTrue(wynikWyszukiwania.isFound());
	}
	@Test
	public void ElementPozaTest() {
		int key = 9;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertEquals(-1, wynikWyszukiwania.getPosition());
		
	}

}
