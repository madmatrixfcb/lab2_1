package lab2_1;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

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
		assertThat(wynikWyszukiwania.getPosition(), is(equalTo(0)));
		assertThat(wynikWyszukiwania.isFound(), is(true));
	}

	@Test
	public void SrodkowyElementTest() {
		int key = 5;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertThat(wynikWyszukiwania.getPosition(), is(equalTo(1)));
		assertThat(wynikWyszukiwania.isFound(), is(true));
	}

	@Test
	public void OstatniElementTest() {
		int key = 7;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertThat(wynikWyszukiwania.getPosition(), is(equalTo(2)));
		assertThat(wynikWyszukiwania.isFound(), is(true));
	}

	@Test
	public void ElementPozaTest() {
		int key = 9;
		int[] seq = { 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertThat(wynikWyszukiwania.getPosition(), is(equalTo(-1)));
		assertThat(wynikWyszukiwania.isFound(), is(false));
	}

	@Test
	public void PojElemJestWSekwencjiTest() {
		int key = 2;
		int[] seq = { 2 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertThat(wynikWyszukiwania.getPosition(), is(equalTo(0)));
		assertThat(wynikWyszukiwania.isFound(), is(true));
	}

	@Test
	public void PojElemNieJestWSekwencjiTest() {
		int key = 3;
		int[] seq = { 2 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertThat(wynikWyszukiwania.getPosition(), is(equalTo(-1)));
		assertThat(wynikWyszukiwania.isFound(), is(false));
	}

	@Test(expected = IllegalArgumentException.class)
	public void PustaSekwencjaTest() {
		int[] seq = {};
		if (seq.length == 0) {
			throw new IllegalArgumentException("Dlugosc sekwencji wynosi 0");
		}

	}

	@Test
	public void SekwencjaMaxPlusJedenTest() {
		int key = 2;
		int max = Integer.MAX_VALUE + 1;
		int[] seq = { 2, 5, 7, 9, max };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertThat(wynikWyszukiwania.getPosition(), is(equalTo(0)));
		assertThat(wynikWyszukiwania.isFound(), is(true));
	}

	@Test
	public void SekwencjaMinMinusJedenTest() {
		int key = 2;
		int min = Integer.MIN_VALUE - 1;
		int[] seq = { min, -5, -2, 0, 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertThat(wynikWyszukiwania.getPosition(), is(equalTo(4)));
		assertThat(wynikWyszukiwania.isFound(), is(true));
	}

	@Test
	public void ElementUjemnyTest() {
		int key = -2;
		int[] seq = { -7, -5, -2, 0, 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertThat(wynikWyszukiwania.getPosition(), is(equalTo(2)));
		assertThat(wynikWyszukiwania.isFound(), is(true));
	}

	@Test
	public void ElementZeroTest() {
		int key = 0;
		int[] seq = { -7, -5, -2, 0, 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertTrue(wynikWyszukiwania.isFound());
		assertEquals(3, wynikWyszukiwania.getPosition());
	}
	
	@Test
	public void SekwencjaMaxTest() {
		int key = 2;
		int max = Integer.MAX_VALUE;
		int[] seq = { 2, 5, 7, 9, max };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertTrue(wynikWyszukiwania.isFound());
		assertEquals(0, wynikWyszukiwania.getPosition());
	}
	
	@Test
	public void SekwencjaMinTest() {
		int key = 2;
		int min = Integer.MIN_VALUE;
		int[] seq = { min, -5, -2, 0, 2, 5, 7 };
		SearchResult wynikWyszukiwania;
		wynikWyszukiwania = BinarySearch.search(key, seq);
		assertTrue(wynikWyszukiwania.isFound());
		assertEquals(4, wynikWyszukiwania.getPosition());
	}

}
