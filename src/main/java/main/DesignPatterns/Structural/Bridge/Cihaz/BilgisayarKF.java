package main.DesignPatterns.Structural.Bridge.Cihaz;

import main.DesignPatterns.Structural.Bridge.Muzik;
import main.DesignPatterns.Structural.Bridge.MuzikCalar.Fizy;
import main.DesignPatterns.Structural.Bridge.SesCihazi.Kulaklık;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {

	public BilgisayarKF() {
		sesCihazi = new Kulaklık();
		muzikCalar = new Fizy();
	}

	@Override
	public void muzikCal(Muzik muzik) {
		System.out.println("Bilgisayar çalıştı");
		super.muzikCal(muzik);
	}

}
