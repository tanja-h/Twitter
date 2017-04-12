package com.twitter.poruke;

/**
 * @author tanja-h
 * @version V0.1
 * Klasa TwitterPoruka ima atribute korisnik i poruka.
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
	 * Metoda baca RuntimeException ukoliko je:
	 * <ul>
	 * <li>Naziv korisnika <b>null</b> </li>
	 * <li>Naziv nije unet.</li>
	 * </ul>
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik==null || korisnik.isEmpty())
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	/**
	 * @return poruka
	 * Metoda vraca tekst poruke.
	 */
	
	public String getPoruka() {
		return poruka;
	}
	/**
	 * @param poruka
	 * Metoda upisuje tekst poruke.
	 * 
	 * @throws RuntimeException
	 * Metoda baca RuntimeException ako: 
	 * <ul>
	 * <li>Uneta poruka je null.</li>
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
	 * Metoda ispisuje podatke o korisniku i njegovoj poruci ().
	 */
	public String toString(){
		return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}
	
}
