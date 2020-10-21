package main.DesignPatterns.Structural.Adapter;

public class TelefonEEAAdaptor implements ElektrikliEvAletleri {

	private Telefon telefon;

	public TelefonEEAAdaptor(Telefon telefon) {
		this.telefon = telefon;
	}

	public int prizeTakVeCalistir() {

		return telefon.sarjEt();
	}

}
