package org.brucend.demo.dp.structure.proxy;

import org.brucend.demo.dp.structure.decorator.Source;
import org.brucend.demo.dp.structure.decorator.Sourceable;

/**
 * 代理类
 * @author brucend
 *
 * 2013-12-28
 */
public class Proxy implements Sourceable{
	
	private Source source;
	
	public Proxy(){
		this.source = new Source();
	}

	@Override
	public void method() {
		System.out.println("before method !!!");
		source.method();
		System.out.println("after method !!!");
	}

}
