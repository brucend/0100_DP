package org.brucend.demo.dp.structure.bridge;

import org.brucend.demo.dp.structure.decorator.Sourceable;

/**
 * 桥接抽象类
 * @author brucend
 *
 * 2013-12-29
 */
public abstract class Bridge {
	
	private Sourceable sourceable;
	
	public void method(){
		this.sourceable.method();
	}

	public Sourceable getSourceable() {
		return sourceable;
	}

	public void setSourceable(Sourceable sourceable) {
		this.sourceable = sourceable;
	}
	
	

}
