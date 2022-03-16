package magacin;

import java.util.List;

import artikli.Artikal;

public class Magacin {
	private List<Artikal>artikli;

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
	
	
}
