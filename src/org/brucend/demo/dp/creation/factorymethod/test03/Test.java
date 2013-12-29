package org.brucend.demo.dp.creation.factorymethod.test03;

import org.brucend.demo.dp.creation.factorymethod.test01.Sender;

public class Test {
	
	public static void main(String[] args) {
		Sender sender = SendFactory.produceMailSender();
		sender.send();
	}

}
