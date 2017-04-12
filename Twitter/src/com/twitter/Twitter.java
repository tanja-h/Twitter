package com.twitter;

import java.util.LinkedList;
import com.twitter.poruke.TwitterPoruka;
	
	/**
	 * Klasa Twitter predstavlja drustvenu mrezu Twitter
	 * @author tanja-h
	 */
public class Twitter {
	
	/**
	 * Atribut poruke predstavlja listu svih poruka na Twitter-u.
	 */
	private LinkedList<TwitterPoruka> poruke =
			new LinkedList<TwitterPoruka>();
	
	/**
	 * Metoda vraca listu svih poruka na Twitter-u. 
	 * @return lista koja sadrzi sve poruke.
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke(){
		return poruke;
	}
	
	/**
	 * Metoda koja pravi novu Twitter poruku i unosi je u listu.
	 * @param korisnik predstavlja ime korisnika koji salje poruku
	 * @param poruka predstavlja sadrzaj poruke
	 */
	public void unesi(String korisnik, String poruka) {
		//Pravi se nova poruka i puni podacima.
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		//Poruka se unosi u listu na kraj
		poruke.addLast(tp);
	}
	
	/**
	 * Metoda pretrazuje listu poruka na Twitter-u i vraca niz poruka koje sadrze odredjeni tag.
	 * @param maxBroj predstavlja maksimalni broj poruka koje hocemo da nadjemo
	 * @param tag oznacava kljucnu rec po kojoj se pretrazuju poruke
	 * @throws RuntimeException u slucaju:
	 * <ul>
	 * <li>Uneti tag je <b>null</b>.</li>
	 * <li>Tag nije unet.</li>
	 * </ul>
	 * @return niz poruka koje sadrze tag (kljucnu rec)
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
		if (tag==null || tag.isEmpty())
			throw new RuntimeException("Morate uneti tag");
		//Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka
		if (maxBroj<=0)
			maxBroj = 100;
		//Pomocna promenljiva koja predstavlja brojac upisanih poruka
		int brojac = 0;
		//Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace
		//sve poruke koje u sebi imaju zadati tag
		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
		//Pretrazuju se poruke i traze se one koje sadrze tag.
		//Ako se nadje neka takva, i ako nije prekoracen maxBroj
		//ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga
		//se prekida.
		for (int i = 0; i < poruke.size(); i++)
			if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
				if (brojac < maxBroj){
					rezultat[brojac]=poruke.get(i);
					brojac++;
				}
				else break;
		return rezultat;
	}
}






