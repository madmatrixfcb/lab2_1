package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SekwencjeTest {

	@Test(expected = IllegalArgumentException.class)
	public void JestWSekwencjiTest() {
		int key = 3;
		int[] seq = { 0, 2 };

		if (seq.length == 0) {
			throw new IllegalArgumentException("Dlugosc sekwencji wynosi 0");
		}
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertTrue(wynikWyszukiwania.isFound());
		assertEquals(0, wynikWyszukiwania.getPosition());
	}

	@Test(expected = IllegalArgumentException.class)
	public void NieJestWSekwencjiTest() {
		int key = 3;
		int[] seq = { 2 };

		if (seq.length == 0) {
			throw new IllegalArgumentException("Dlugosc sekwencji wynosi 0");
		}
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertFalse(wynikWyszukiwania.isFound());
		assertEquals(-1, wynikWyszukiwania.getPosition());
	}

}
