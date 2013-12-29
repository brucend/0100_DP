package org.brucend.demo.dp.creation.factorymethod.test01;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("MailSender...");
	}

}
