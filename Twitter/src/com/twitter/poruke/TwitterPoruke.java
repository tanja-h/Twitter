package com.twitter.poruke;

public class TwitterPoruke {
	private String korisnik;
	private String poruka;
	
	public String getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(String korisnik) {
		if (korisnik==null || !korisnik.isEmpty())
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	public String getPoruka() {
		return "poruka";
	}
	public void setPoruka(String poruka) {
		if (this.poruka==null || this.poruka == new String("") ||
				this.poruka.length()>140)
			throw new RuntimeException(
					"Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	public String toString(){
		return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}
}