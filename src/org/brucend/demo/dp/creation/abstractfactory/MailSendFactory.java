package org.brucend.demo.dp.creation.abstractfactory;

import org.brucend.demo.dp.creation.factorymethod.test01.MailSender;
import org.brucend.demo.dp.creation.factorymethod.test01.Sender;

public class MailSendFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
