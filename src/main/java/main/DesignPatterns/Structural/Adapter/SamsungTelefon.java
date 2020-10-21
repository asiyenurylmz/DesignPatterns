package main.DesignPatterns.Structural.Adapter;

public class SamsungTelefon implements Telefon {

	private int calismaVoltaji;

	public SamsungTelefon() {
		calismaVoltaji = 5;
	}

	public int sarjEt() {
		System.out.println("Samsung Telefon çalışıyor.");
		return calismaVoltaji;
	}

}
