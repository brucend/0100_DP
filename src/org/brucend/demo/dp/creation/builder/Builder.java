package org.brucend.demo.dp.creation.builder;

import java.util.ArrayList;
import java.util.List;

import org.brucend.demo.dp.creation.factorymethod.test01.MailSender;
import org.brucend.demo.dp.creation.factorymethod.test01.SMSSender;
import org.brucend.demo.dp.creation.factorymethod.test01.Sender;

/**
 * 构建者模式
 * @author brucend
 *
 * 2013-12-29
 */
public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for(int i = 0; i < count; i ++){
			list.add(new MailSender());
		}
	}
	public void produceSMSSender(int count){
		for(int i = 0; i < count; i ++){
			list.add(new SMSSender());
		}
	}

}
