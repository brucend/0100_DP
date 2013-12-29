package org.brucend.demo.dp.structure.proxy;

import org.brucend.demo.dp.structure.decorator.Sourceable;

public class Test {
	
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}

}
