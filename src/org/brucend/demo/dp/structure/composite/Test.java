package org.brucend.demo.dp.structure.composite;

public class Test {
	
	public static void main(String[] args) {
		Tree tree = new Tree("A");
		
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.addChild(nodeC);
		tree.root.addChild(nodeB);
		
		tree.show();
	}

}
