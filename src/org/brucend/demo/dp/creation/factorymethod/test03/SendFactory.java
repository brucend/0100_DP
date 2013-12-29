package org.brucend.demo.dp.creation.factorymethod.test03;

import org.brucend.demo.dp.creation.factorymethod.test01.MailSender;
import org.brucend.demo.dp.creation.factorymethod.test01.SMSSender;
import org.brucend.demo.dp.creation.factorymethod.test01.Sender;

/**
 * 静态工厂方法
 * @author brucend
 *
 * 2013-12-27
 */
public class SendFactory {
	
	public static Sender produceMailSender(){
		return new MailSender();
	}
	
	public static Sender produceSMSSendor(){
		return new SMSSender();
	}

}
