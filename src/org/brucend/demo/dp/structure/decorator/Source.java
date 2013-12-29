package org.brucend.demo.dp.structure.decorator;

/**
 * 被装饰类
 * @author brucend
 *
 * 2013-12-28
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("Source method !!!");
	}

}
