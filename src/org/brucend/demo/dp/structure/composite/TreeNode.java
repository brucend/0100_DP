package org.brucend.demo.dp.structure.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 组合模式(以树节点为例)
 * @author brucend
 *
 * 2013-12-29
 */
public class TreeNode {

	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();

	public void show() {
		System.out.println("[parent: " + (parent == null ? "*" : parent.getName()) + "; name: "
				+ getName() + "]");
		
		for(TreeNode node : children){
			node.show();
		}
	}

	public TreeNode(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	/**
	 * 添加子节点
	 * 
	 * @param node
	 */
	public void addChild(TreeNode node) {
		this.children.add(node);
	}

	/**
	 * 删除子节点
	 * 
	 * @param node
	 */
	public void deleteChild(TreeNode node) {
		this.children.remove(node);
	}

	/**
	 * 获取所有的子节点
	 * 
	 * @return
	 */
	public Enumeration<TreeNode> getChildren() {
		return this.children.elements();
	}

}
