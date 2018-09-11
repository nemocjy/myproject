import java.util.Scanner;

public class tree {

	public static Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

//        int[] array = new int[A];
        
        String[] array = new String[A];
        String[][] array2 = new String[A][2];
        
        for(int i = 0; i < A; i++) {
        	array[i] = sc.next();
        	for(int j = 0; j < 2; j++) {
        		array2[i][j] = sc.next();
//        		addTree(sc.next());
        	}
        }
        printPreorderTree(array, array2);
//        printPreorderTree(root);
//        check(0, A, A, array);
        	
	}
	
	public static void printPreorderTree(String[] array, String[][] array2) {
		System.out.print(array[0]);
		for(int i = 1; i < array.length; i++) {
			
//			System.out.print(array[i]);
			
			
			for(int j = 0; j < array2.length; j++) {
				for(int k = 0; k < array2[0].length; k++) {
//					if(array[i].equals(array2[j][k])) {
						
						System.out.print(array2[j][k]);
//					}
				}
//					if(!".".equals(array2[j][k]))
//					System.out.print(array2[j][k]);
//				}
			}
		}
	}
	
	public static void addTree(String data) {
		if(root == null) {
			Node node = new Node();
			node.setData(data);
			root = node;
		} else {
			addTree(root, data);
		}
	}
	
	public static void addTree(Node root, String data) {
		if(root.getLeft() == null) {
			Node node = new Node();
			node.setData(data);
			root.setLeft(node);
		} else {
			Node node = new Node();
			node.setData(data);
			root.setRight(node);
//			addTree(root.getLeft(), data);
		}
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
	
	public static void printPreorderTree(Node node) {
		if(node == null) return;
		
		System.out.print(node.getData());
		
		printPreorderTree(node.getLeft());
		
		printPreorderTree(node.getRight());
	}
	
	public static void printInorderTree(Node node) {
		printInorderTree(node.getLeft());
		
		System.out.print(node.getData());
		
		printInorderTree(node.getRight());
	}
	
	public static void printPostorderTree(Node node) {
		printPostorderTree(node.getLeft());
		
		printPostorderTree(node.getRight());
		
		System.out.print(node.getData());
		
		
	}

}
