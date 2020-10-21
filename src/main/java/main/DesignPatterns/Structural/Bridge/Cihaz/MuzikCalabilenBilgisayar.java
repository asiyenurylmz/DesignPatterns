package main.DesignPatterns.Structural.Bridge.Cihaz;

import main.DesignPatterns.Structural.Bridge.Muzik;
import main.DesignPatterns.Structural.Bridge.MuzikCalar.MuzikCalar;
import main.DesignPatterns.Structural.Bridge.SesCihazi.SesCihazi;

public abstract class MuzikCalabilenBilgisayar {

	protected SesCihazi sesCihazi;
	protected MuzikCalar muzikCalar;

	public MuzikCalabilenBilgisayar() {
	}

	public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
		super();
		this.sesCihazi = sesCihazi;
		this.muzikCalar = muzikCalar;
	}

	void muzikCal(Muzik muzik) {
		String ses = muzikCalar.muzikCal(muzik);
		sesCihazi.sesiCal(ses);
	}
}
