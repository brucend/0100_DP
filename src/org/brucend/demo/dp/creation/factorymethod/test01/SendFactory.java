package org.brucend.demo.dp.creation.factorymethod.test01;

/**
 * 普通工厂方法
 * @author brucend
 *
 * 2013-12-27
 */
public class SendFactory {
	
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SMSSender();
		}else{
			System.out.println("请输入合适的类型!!!");
			return null;
		}
	}

}
