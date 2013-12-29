package org.brucend.demo.dp.creation.abstractfactory;

import org.brucend.demo.dp.creation.factorymethod.test01.SMSSender;
import org.brucend.demo.dp.creation.factorymethod.test01.Sender;

public class SMSSendFactory implements Provider {

	@Override
	public Sender produce() {
		return new SMSSender();
	}

}
