package org.brucend.demo.dp.structure.adapter.instancedapter;

import org.brucend.demo.dp.structure.adapter.classadapter.Source;
import org.brucend.demo.dp.structure.adapter.classadapter.Targetable;

public class Test {
	
	public static void main(String[] args) {
		Source source = new Source();
		Targetable t = new Wrapper(source);
		t.method1();
		t.method2();
	}

}
