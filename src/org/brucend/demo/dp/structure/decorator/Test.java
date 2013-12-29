package org.brucend.demo.dp.structure.decorator;

public class Test {
	
	public static void main(String[] args) {
		Sourceable s1 = new Source();
		Sourceable s2 = new Decorator(s1);
		s2.method();
	}

}
