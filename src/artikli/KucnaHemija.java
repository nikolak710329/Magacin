package artikli;

import java.time.DateTimeException;
import java.util.Date;

public class KucnaHemija extends Artikal {

	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja.before(new Date())) 
			throw new DateTimeException("Nevalidan rok trajanja!");
		this.rokTrajanja = rokTrajanja;
	}
}
