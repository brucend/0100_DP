package org.brucend.demo.dp.creation.singleton;

public class Singleton03 {

	private static Singleton03 instance = null;

	/**
	 * 同步块
	 * @return
	 */
	public static synchronized Singleton03 getInstance() {
		if (instance == null) {
			synchronized (instance) {
				instance = new Singleton03();
			}
		}
		return instance;
	}

	private Singleton03() {

	}

}
