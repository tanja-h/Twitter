package com.twitter.poruke;

/**
 * @author tanja-h
 * @version V0.1
 * Klasa Twitter ima atribute korisnik i poruka.
 */
public class TwitterPoruke {
	/**
	 * Atribut korisnik oznacava naziv korisnika.
	 */
	private String korisnik;
	/**
	 * Atribut poruka oznacava poruku korisnika.
	 */
	private String poruka;
	
	
	/**
	 * @return korisnik
	 * Metoda vraca naziv korisnika
	 */
	public String getKorisnik() {
		return korisnik;
	}
	/**
	 * @param korisnik
	 * Metoda podesava naziv korisnika.
	 * 
	 * @throws RuntimeException
	 * Metoda baca RuntimeException
	 * ukoliko je naziv korisnika null 
	 * ili naziv nije unet.
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik==null || !korisnik.isEmpty())
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	/**
	 * @return poruka
	 * Metoda vraca tekst poruke.
	 */
	
	public String getPoruka() {
		return "poruka";
	}
	/**
	 * @param poruka
	 * Metoda upisuje tekst poruke.
	 * 
	 * @throws RuntimeException
	 * Metoda baca RuntimeException ako je uneta poruka null, prazan string
	 * ili ima vise od 140 karaktera.
	 */
	public void setPoruka(String poruka) {
		if (this.poruka==null || this.poruka == new String("") ||
				this.poruka.length()>140)
			throw new RuntimeException(
					"Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	
	/**
	 * Metoda ispisuje podatke o korisniku i njegovoj poruci.
	 */
	public String toString(){
		return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}
}
