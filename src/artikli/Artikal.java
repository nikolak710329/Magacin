package artikli;

public class Artikal {

	protected String naziv;
	protected String opis;
	protected int sifra;
	protected int kolicina;
	protected String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if (naziv == null)
			throw new NullPointerException("Naziv ne sme biti null!");
		
		if (naziv.isEmpty())
			throw new IllegalArgumentException("Naziv ne sme biti prazan string!");
		this.naziv = naziv;
	}
	public String getOpis() {
		if (opis == null)
			throw new NullPointerException("Opis ne sme biti null!");
		
		if (opis.isEmpty())
			throw new IllegalArgumentException("Opis ne sme biti prazan string");
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if (sifra <= 0)
			throw new IllegalArgumentException("Sifra mora biti validna!");
		this.sifra = sifra;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if (kolicina <= 0)
			throw new IllegalArgumentException("Kolicina mora bii veci od nule!");
		this.kolicina = kolicina;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + sifra;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", opis=" + opis + ", sifra=" + sifra + ", kolicina=" + kolicina + "]";
	}
	
	
}
