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
		SearchResult searchResult;
		searchResult = BinarySearch.search(key, seq);
		assertTrue(searchResult.isFound());
		assertEquals(0, searchResult.getPosition());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void NieJestWSekwencjiTest() {
		int key = 3;
		int[] seq = { 2 };
		
		if (seq.length == 0) {
			throw new IllegalArgumentException("Dlugosc sekwencji wynosi 0");
		}
		SearchResult searchResult;
		searchResult = BinarySearch.search(key, seq);
		assertFalse(searchResult.isFound());
		assertEquals(-1, searchResult.getPosition());
	}
	


}
