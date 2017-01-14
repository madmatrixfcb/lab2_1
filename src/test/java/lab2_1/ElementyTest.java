package lab2_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class ElementyTest {

	@Test(expected = IllegalArgumentException.class)
	public void PierwszyElementTest() {
		int key = 3;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		if (seq.length == 0) {
			throw new IllegalArgumentException("Dlugosc sekwencji wynosi 0");
		}
		assertEquals(0, wynikWyszukiwania.getPosition());
	}

	@Test(expected = IllegalArgumentException.class)
	public void SrodkowyElementTest() {
		int key = 5;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertEquals(1, wynikWyszukiwania.getPosition());

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void OstatniElementTest() {
		int key = 7;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertEquals(2, wynikWyszukiwania.getPosition());
	}
	@Test(expected = IllegalArgumentException.class)
	public void ElementPozaTest() {
		int key = 9;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertEquals(-1, wynikWyszukiwania.getPosition());
		
	}

}
