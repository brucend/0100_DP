package org.brucend.demo.dp.creation.abstractfactory;

import org.brucend.demo.dp.creation.factorymethod.test01.Sender;

/**
 * 抽象工厂
 * @author brucend
 *
 * 2013-12-27
 */
public interface Provider {
	public Sender produce();
}
