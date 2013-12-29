package org.brucend.demo.dp.structure.bridge;

/**
 * 桥接器
 * @author brucend
 *
 * 2013-12-29
 */
public class MyBridge extends Bridge {
	
	@Override
	public void method() {
		getSourceable().method();
	}

}
