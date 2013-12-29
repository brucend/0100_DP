package org.brucend.demo.dp.creation.singleton;

public class Singleton04 {

	private Singleton04() {

	}

	/**
	 * 内部类维护单例
	 * @author brucend
	 *
	 * 2013-12-28
	 */
	private static class SingletonFactory {
		private static Singleton04 instance = new Singleton04();
	}
	
	public static Singleton04 getInstance(){
		return SingletonFactory.instance;
	}

}
