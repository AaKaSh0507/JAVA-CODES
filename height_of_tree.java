import java.util.*;

public class height_of_tree {
	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static int height(Node root) {
		if (root == null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh) + 1;
	}

	public static int countNodes(Node root) {
		if (root == null) {
			return 0;
		}
		int lcount = countNodes(root.left);
		int rcount = countNodes(root.right);
		return lcount + rcount + 1;
	}

	public static int sumofNodes(Node root) {
		if (root == null) {
			return 0;
		}
		int lsum = sumofNodes(root.left);
		int rsum = sumofNodes(root.right);
		return rsum + lsum + root.data;
	}

	static class Info {
		int diam;
		int ht;

		public Info(int d, int h) {
			this.diam = d;
			this.ht = h;
		}
	}

	public static Info diameter(Node root) {
		if (root == null) {
			return new Info(0, 0);
		}
		Info leftInfo = diameter(root.left);
		Info rightInfo = diameter(root.right);
		int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
		int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
		return new Info(diam, ht);
	}

	public static boolean isSubtree(Node root, Node subRoot) {
		if (subRoot == null) {
			return false;
		}
		if (root != null && subRoot != null) {
			if (root.data == subRoot.data) {
				if (isIdentical(root, subRoot)) {
					return true;
				}
			}
		}
		boolean leftAns = false;
		boolean rightAns = false;
		if (root != null && subRoot != null) {
			leftAns = isSubtree(root.left, subRoot);
			rightAns = isSubtree(root.right, subRoot);
		}

		return leftAns || rightAns;
	}

	public static boolean isIdentical(Node node, Node subRoot) {
		if (node == null && subRoot == null) {
			return false;
		} else if (node == null || subRoot == null || node.data != subRoot.data) {
			return false;
		}
		if (isIdentical(node.left, subRoot.left)) {
			return false;
		}
		if (!isIdentical(node.right, subRoot.right)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.println(height(root));
		System.out.println(countNodes(root));
		System.out.println(sumofNodes(root));
		System.out.println(diameter(root).diam);
		Node subRoot = new Node(2);
		subRoot.left = new Node(4);
		subRoot.right = new Node(3);
		System.out.println(isSubtree(root, subRoot));
	}
}
