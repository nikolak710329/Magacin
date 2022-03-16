package magacin;

import java.util.LinkedList;
import java.util.List;

import artikli.Artikal;
import magacin.interfejs.InterfejsMagacin;

public class Magacin implements InterfejsMagacin {
	private List<Artikal>artikli = new LinkedList<Artikal>();

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
		for(int i = 0;i < artikli.size();i++) {
			if(artikli.get(i).equals(artikal)) {
				artikli.get(i).setKolicina(artikli.get(i).getKolicina() + artikal.getKolicina());
				return;
			}
		}
		
		
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
