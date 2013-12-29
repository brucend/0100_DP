package org.brucend.demo.dp.creation.abstractfactory;

import org.brucend.demo.dp.creation.factorymethod.test01.Sender;

public class Test {
	
	public static void main(String[] args) {
		Provider p = new MailSendFactory();
		Sender sender = p.produce();
		sender.send();
	}

}
