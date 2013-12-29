package org.brucend.demo.dp.structure.composite;

public class Tree {
	
	TreeNode root = null;

	public Tree(String name) {
		this.root = new TreeNode(name);
	}
	
	public void show(){
		this.root.show();
	}

}
