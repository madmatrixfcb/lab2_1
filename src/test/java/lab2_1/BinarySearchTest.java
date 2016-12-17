package lab2_1;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {

	@Test(expected = IllegalArgumentException.class)
	public void JestWSekwencjiTest() {
		int key = 3;
		int[] seq = { 0, 2 };
		SearchResult searchResult;
		searchResult = BinarySearch.search(key, seq);
		if (seq.length == 0) {
			throw new IllegalArgumentException("Dlugosc sekwencji wynosi 0");
		}
		assertTrue(searchResult.isFound());
		assertEquals(0, searchResult.getPosition());
	}

}
