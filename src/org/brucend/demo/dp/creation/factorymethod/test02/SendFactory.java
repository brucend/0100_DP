package org.brucend.demo.dp.creation.factorymethod.test02;

import org.brucend.demo.dp.creation.factorymethod.test01.MailSender;
import org.brucend.demo.dp.creation.factorymethod.test01.SMSSender;
import org.brucend.demo.dp.creation.factorymethod.test01.Sender;

/**
 * 多个工程方法
 * @author brucend
 *
 * 2013-12-27
 */
public class SendFactory {
	
	public Sender produceMailSender(){
		return new MailSender();
	}
	
	public Sender produceSMSSendor(){
		return new SMSSender();
	}

}
