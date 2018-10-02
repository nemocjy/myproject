import java.util.Scanner;

public class sc5tree1 {

	public static Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        Tree tree = new Tree();
        String a, b, c;
        for(int i = 0; i < A; i++) {
        	a = sc.next();
        	b = sc.next();
        	c = sc.next();

        	tree.addTree(a, b, c);
        }
        
        tree.printPreorderTree(tree.root);
        System.out.println();
        tree.printInorderTree(tree.root);
        System.out.println();
        tree.printPostorderTree(tree.root);
//        printPreorderTree(root);
//        check(0, A, A, array);
        	
	}
	
	public static class Node {
		private String data;
		private Node left;
		private Node right;

		public Node(String data) {
			this.setData(data);
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getData() {
			return data;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getLeft() {
			return left;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public Node getRight() {
			return right;
		}
	}
	
	static class Tree {
		static Node root;

		public static void search(Node root, String data, String leftData, String rightData) {
			if(root == null) { 
				return;
			} else if(root.data.equals(data)) {
				if(!leftData.equals("-1")) root.left = new Node(leftData);
				if(!rightData.equals("-1")) root.right = new Node(rightData);
			} else {
				search(root.left, data, leftData, rightData);
				search(root.right, data, leftData, rightData);
			}
		}

		public static void addTree(String data, String leftData, String rightData) {
			if(root == null) {
				if(!data.equals("-1")) root = new Node(data);
				if(!leftData.equals("-1")) root.left = new Node(leftData);
				if(!rightData.equals("-1")) root.right = new Node(rightData);
			} else {
				search(root, data, leftData, rightData);
			}
		}

		public static void printPreorderTree(Node node) {
			System.out.print(node.data+" ");
			if(node.left != null) printPreorderTree(node.left);
			if(node.right != null) printPreorderTree(node.right);
		}

		public static void printInorderTree(Node node) {
			if(node.left != null) printInorderTree(node.left);
			System.out.print(node.data+" ");
			if(node.right != null) printInorderTree(node.right);
		}

		public static void printPostorderTree(Node node) {
			if(node.left != null) printPostorderTree(node.left);
			if(node.right != null) printPostorderTree(node.right);
			System.out.print(node.data+" ");

		}
	}

}
