package org.brucend.demo.dp.creation.singleton;

/**
 * 简单单例(没有同步)
 * @author brucend
 *
 * 2013-12-27
 */
public class Singleton01 {
	
	private static Singleton01 instance = null;
	
	public static Singleton01 getInstance(){
		if(instance == null){
			instance = new Singleton01();
		}
		return instance;
	}
	
	private Singleton01(){
		
	}

}
