package main.DesignPatterns.Structural.Bridge.SesCihazi;

public class Kulaklık implements SesCihazi {

	@Override
	public void sesiCal(String ses) {
		System.out.println("Kulaklık ses çalıyor " + ses);
	}
	
	

}
