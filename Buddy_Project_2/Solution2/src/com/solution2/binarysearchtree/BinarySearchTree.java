package com.solution2.binarysearchtree;


public class BinarySearchTree {
	
	public Node node;
	Node prev = null;
	public Node newHead = null;

	public void UpdatingTransacationBST(Node root) {
		if (root == null)
			return;

		UpdatingTransacationBST(root.left);
		Node rightNode = root.right;

		if (newHead == null) {
			newHead = root;
			root.left = null;
			prev = root;
		} else {

			prev.right = root;
			root.left = null;
			prev = root;
		}
		UpdatingTransacationBST(rightNode);
	}

	public void TransactionTreeTraversal(Node root) {

		if (root == null)
			return;
		System.out.print(root.data + " ");
		TransactionTreeTraversal(root.right);
	}
	
	
	

}
