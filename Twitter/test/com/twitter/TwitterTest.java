package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {
	private Twitter t;
	
	@Before
	public void setUp() throws Exception {
		t = new Twitter();
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void testVratiSvePoruke() {
		t.unesi("Tanja", "Cao, ja sam Tanja!");
		t.unesi("Ana", "Cao, ja nisam Tanja!");
		t.unesi("Maja", "Cao, ni ja nisam Tanja!");
		
		LinkedList<TwitterPoruka> tp = new LinkedList<TwitterPoruka>();
		
		TwitterPoruka p1 = new TwitterPoruka();
		p1.setKorisnik("Tanja");
		p1.setPoruka("Cao, ja sam Tanja!");
		tp.addLast(p1);
		
		TwitterPoruka p2 = new TwitterPoruka();
		p2.setKorisnik("Ana");
		p2.setPoruka("Cao, ja nisam Tanja!");
		tp.addLast(p2);
		
		TwitterPoruka p3 = new TwitterPoruka();
		p3.setKorisnik("Maja");
		p3.setPoruka("Cao, ni ja nisam Tanja!");
		tp.addLast(p3);
		
		if(t.vratiSvePoruke().size() != tp.size()){
			fail("Liste nemaju isti broj elemenata!");
		}
		
	}

	@Test
	public void testUnesi() {
		t.unesi("Tanja", "Cao ja sam Tanja!");
		if(!t.vratiSvePoruke().getLast().getKorisnik().equals("Tanja")){
			fail("Greska u unosu naziva korisnika");
		}
		
		if(!t.vratiSvePoruke().getLast().getPoruka().equals("Cao ja sam Tanja!")){
			fail("Greska u unosu sadrzaja poruke.");
		}
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagNull() {
		t.vratiPoruke(10, null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeTagPrazanString() {
		t.vratiPoruke(10, "");
	}
	
	@Test
	public void testVratiPoruke() {
		t.unesi("Tanja", "Cao, ja sam Tanja!");
		t.unesi("Ana", "Cao, ja nisam Tanja!");
		t.unesi("Maja", "Cao, ni ja nisam Tanja!");
		
		int br = 0;
		TwitterPoruka[] niz = t.vratiPoruke(10, "nisam");
		
		for(int i=0; i<niz.length; i++){
			if(niz[i] != null){
				br++;
			}
		}
		assertEquals(2, br);
	}

}

