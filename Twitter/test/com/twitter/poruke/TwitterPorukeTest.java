/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Tanja
 *
 */
public class TwitterPorukeTest {

	private TwitterPoruke t;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		t = new TwitterPoruke();
	}
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		t = null;
	}

	
	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruke#setKorisnik(java.lang.String)}.
	 */
	@Test
	public void testSetKorisnik() {
		t.setKorisnik("Tanja");
		assertEquals("Tanja", t.getKorisnik());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		t.setKorisnik(null);
		
	}
	
	/*
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikEmpty() {
		t.setKorisnik();
		
	}*/

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruke#setPoruka(java.lang.String)}.
	 */
	@Test
	public void testSetPoruka() {
		t.setPoruka("Ovo je neka poruka.");
		assertEquals("Ovo je neka poruka.",t.getPoruka());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		t.setPoruka(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPrazanString() {
		t.setPoruka("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPoruka140karaktera() {
		t.setPoruka("Danas se osecate dobro i prakticno,"+
				" ali vas pristup ce biti efikasan samo ako se prihvatite"+
				" liderske uloge. Ubacite svoje ideje u prvi plan umesto sto"+
				" im dopustate da budu zatrpane projektima koji dolaze. "+
				"To je kljuc danasnjeg uspeha.");
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruke#toString()}.
	 */
	@Test
	public void testToString() {
		t.setKorisnik("Tanja");
		t.setPoruka("Cao ja ti saljem poruku.");
		
		assertEquals("KORISNIK:"+t.getKorisnik()+" PORUKA:"+
						t.getPoruka(), t.toString());
	}

}




