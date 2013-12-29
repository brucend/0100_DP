package org.brucend.demo.dp.structure.facade;

/**
 * 外观类
 * @author brucend
 *
 * 2013-12-28
 */
public class Computer {

	private CPU cpu;
	private Disk disk;
	private Memory memory;

	public Computer() {
		cpu = new CPU();
		disk = new Disk();
		memory = new Memory();
	}

	public void startup() {
		System.out.println("Computer startup!!!");
		cpu.startup();
		memory.startup();
		disk.startup();

		System.out.println("Computer startup finished!!!");
	}

	public void startdown() {
		System.out.println("begin to close the computer!!!");
		disk.startdown();
		memory.startdown();
		cpu.startdown();
		System.out.println("Computer closed!!!");
	}

}
