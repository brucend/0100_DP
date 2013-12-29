package org.brucend.demo.dp.creation.factorymethod.test01;

public class Test {
	
	public static void main(String[] args) {
		SendFactory sf = new SendFactory();
		Sender sender = sf.produce("mail");
		sender.send();
	}

}
