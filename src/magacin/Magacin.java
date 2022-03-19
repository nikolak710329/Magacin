package magacin;

import java.util.LinkedList;
import java.util.List;

import artikli.Artikal;
import magacin.interfejs.InterfejsMagacin;

public class Magacin implements InterfejsMagacin {
	private List<Artikal> artikli = new LinkedList<Artikal>();

	public List<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(List<Artikal> artikli) {

		this.artikli = artikli;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artikli == null) ? 0 : artikli.hashCode());
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
		Magacin other = (Magacin) obj;
		if (artikli == null) {
			if (other.artikli != null)
				return false;
		} else if (!artikli.equals(other.artikli))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Magacin [artikli=" + artikli + "]";
	}

	@Override
	public void dodajArtikal(Artikal artikal) {

		if (artikal == null)
			throw new NullPointerException("Artikal ne sme biti null!");
		
		for(int i = 0;i < artikli.size();i++) {
			if(artikli.get(i).equals(artikal)) {
				artikli.get(i).setKolicina(artikli.get(i).getKolicina() + artikal.getKolicina());
				return;
			}
		}
		
		artikli.add(artikal);


	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if (artikal == null)
			throw new NullPointerException("Artikal ne sme biti null!");

		for (Artikal a : artikli) {
			if (a.equals(artikal)) {
				if (a.getKolicina() < artikal.getKolicina()) {
					throw new ArithmeticException("Nedovoljno kolicine na zalihama!");
				}
				a.setKolicina(a.getKolicina() - artikal.getKolicina());
			}
		}
		throw new IllegalArgumentException("Nepostojeci artikal!");
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		if (sifra <= 0) {
			throw new IllegalArgumentException("Sifra mora biti validna!");
		}
		for (Artikal a : artikli) {
			if (a.getSifra() == sifra) {
				return a;
			}
		}
		return null;
	}

}
