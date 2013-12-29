package org.brucend.demo.dp.creation.prototype;

/**
 * 简单原型
 * @author brucend
 *
 * 2013-12-28
 */
public class Prototype implements Cloneable {
	
	/**
	 * 浅复制
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype p = (Prototype) super.clone();
		return p;
	}
	
	//TODO 深复制

}
