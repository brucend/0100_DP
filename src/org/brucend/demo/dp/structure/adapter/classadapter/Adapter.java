package org.brucend.demo.dp.structure.adapter.classadapter;

/**
 * 继承Source，实现Targetable
 * @author brucend
 *
 * 2013-12-28
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("Adapter method 2!!!");
	}

}
