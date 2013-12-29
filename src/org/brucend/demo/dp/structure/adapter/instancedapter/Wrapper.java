package org.brucend.demo.dp.structure.adapter.instancedapter;

import org.brucend.demo.dp.structure.adapter.classadapter.Source;
import org.brucend.demo.dp.structure.adapter.classadapter.Targetable;

/**
 * 组合模式适配
 * @author brucend
 *
 * 2013-12-28
 */
public class Wrapper implements Targetable{
	
	private Source source;
	
	public Wrapper(Source source){
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("Wrapper method 2!!!");
	}

}
