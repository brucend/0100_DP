package org.brucend.demo.dp.structure.bridge;

import org.brucend.demo.dp.structure.decorator.Sourceable;

public class SourceSub1 implements Sourceable {

	@Override
	public void method() {
		System.out.println("SourceSub1 method !!!");
	}

}
