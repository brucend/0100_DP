package org.brucend.demo.dp.creation.singleton;

public class Singleton02 {
	
	private static Singleton02 instance = null;
	
	/**
	 * 同步方法，有缺陷
	 * @return
	 */
	public static synchronized Singleton02 getInstance(){
		if(instance == null){
			instance = new Singleton02();
		}
		return instance;
	}
	
	private Singleton02(){
		
	}

}
