package main.DesignPatterns.Structural.Bridge;

import main.DesignPatterns.Structural.Bridge.Cihaz.BilgisayarKF;

public class App {

	public static void main(String[] args) {
		Muzik muzik = new Muzik("Yüzyüzeyken Konuşuruz - Bodrum", "En sonunda Bodrum");
		
		BilgisayarKF bilgisayarKF=new BilgisayarKF();
		bilgisayarKF.muzikCal(muzik);
	}
}
