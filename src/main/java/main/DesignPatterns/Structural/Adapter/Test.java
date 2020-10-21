package main.DesignPatterns.Structural.Adapter;

public class Test {

	public static void main(String[] args) {
		Priz priz = new Priz();
		
		Utu utu= new Utu();
		Buzdolabi buzdolabi= new Buzdolabi();
		
		priz.elektrikVer(utu);
		priz.elektrikVer(buzdolabi);
		
		SamsungTelefon samsungTelefon= new SamsungTelefon();
		TelefonEEAAdaptor adaptor=new TelefonEEAAdaptor(samsungTelefon);
		
		priz.elektrikVer(adaptor);
	}
}
