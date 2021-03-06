package org.brucend.demo.dp.structure.decorator;

public class Decorator implements Sourceable {
	
	private Sourceable source;
	
	public Decorator(Sourceable source){
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before method!!!");
		source.method();
		System.out.println("after method!!!");
	}

}
