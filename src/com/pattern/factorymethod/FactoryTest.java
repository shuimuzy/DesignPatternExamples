package com.pattern.factorymethod;

public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();  
		Sender sender = null;
		sender = factory.produce("sms");
		sender.send();
		sender = factory.produce("mail");
		sender.send();

	}

}
