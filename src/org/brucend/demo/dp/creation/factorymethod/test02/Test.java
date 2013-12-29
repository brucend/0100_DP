package org.brucend.demo.dp.creation.factorymethod.test02;

import org.brucend.demo.dp.creation.factorymethod.test01.Sender;

public class Test {
	
	public static void main(String[] args) {
		SendFactory sf = new SendFactory();
		Sender sender = sf.produceMailSender();
		sender.send();
	}

}
