package com.twitter.poruke;

/**
 * Klasa TwitterPoruka predstavlja poruku korisnika.
 * @author tanja-h
 * @version V0.1
 */
public class TwitterPoruka {
	/**
	 * Atribut korisnik oznacava naziv korisnika.
	 */
	private String korisnik;
	/**
	 * Atribut poruka oznacava poruku korisnika.
	 */
	private String poruka;
	
	
	/**
	 * Metoda vraca naziv korisnika.
	 * @return korisnik
	 */
	public String getKorisnik() {
		return korisnik;
	}
	/**
	 * Metoda podesava naziv korisnika.
	 * @param korisnik predstavlja ime korisnika
	 * @throws RuntimeException u slucaju:
	 * <ul>
	 * <li>Naziv korisnika <b>null</b>.</li>
	 * <li>Naziv nije unet.</li>
	 * </ul>
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik==null || korisnik.isEmpty())
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	
	/**
	 * Metoda vraca tekst poruke.
	 * @return poruka
	 */
	public String getPoruka() {
		return poruka;
	}
	
	/**
	 * Metoda upisuje tekst poruke.
	 * @param poruka predstavlja sadrzaj poruke
	 * 
	 * @throws RuntimeException u slucaju:
	 * <ul>
	 * <li>Uneta poruka je <b>null</b>.</li>
	 * <li>Unet je prazan string</li>
	 * <li>Poruka ima vise od 140 karaktera.</li>
	 * </ul>
	 */
	public void setPoruka(String poruka) {
		if (poruka==null || poruka.equals("") || poruka.length()>140)
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
