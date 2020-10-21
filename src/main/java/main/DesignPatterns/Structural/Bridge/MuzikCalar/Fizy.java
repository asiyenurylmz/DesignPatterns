package main.DesignPatterns.Structural.Bridge.MuzikCalar;

import main.DesignPatterns.Structural.Bridge.Muzik;

public class Fizy implements MuzikCalar{

	
	
	@Override
	public String muzikCal(Muzik muzik) {
		System.out.println("Fizy " + muzik+ " şarkısını çalıyor.");
		return muzik.getSes();
	}
	

}
