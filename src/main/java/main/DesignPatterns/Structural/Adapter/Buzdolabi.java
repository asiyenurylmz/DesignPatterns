package main.DesignPatterns.Structural.Adapter;

public class Buzdolabi implements ElektrikliEvAletleri{

	private int volt;

	public Buzdolabi() {
		this.volt=220;
	}
	
	public int prizeTakVeCalistir() {
		System.out.println("Buzdolabı çalışıyor.");
		return volt;
	}

	
}
