package org.brucend.demo.dp.structure.bridge;

import org.brucend.demo.dp.structure.decorator.Sourceable;

public class Test {
	
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		
		Sourceable sourceable1 = new SourceSub1();
		bridge.setSourceable(sourceable1);
		bridge.method();
		
		Sourceable sourceable2 = new SourceSub2();
		bridge.setSourceable(sourceable2);
		bridge.method();
	}

}
