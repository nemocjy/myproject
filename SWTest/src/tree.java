import java.util.Scanner;

public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        int[] array = new int[100];
        
        check(0, A, A, array);
        	
	}
	
	public class Node {
	    private char data;
	    private Node left;
	    private Node right;
	  
	    public Node(char data) {
	        this.setData(data);
	    }
	  
	    public void setData(char data) {
	        this.data = data;
	    }
	  
	    public char getData() {
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

	private static void check(int idx, int num2, int total, int[] array) {
//        System.out.println(num1-num2+"+"+num2);
//		System.out.println(idx);
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]+" ");
//		}
//		System.out.println();
		
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) break; 
			sum += array[i];
		}
		
		if(sum == total) {
			int lIdx = 0;
			 for(int i = 0; i < array.length; i++) {
				 System.out.print(array[i]);
				 if(array[i+1] == 0) {
					 lIdx = i;
					 System.out.println();
					 break;
				 }
				 else
				 {
					 System.out.print("+");
				 }
			 }
			 
			 if(array[lIdx] > 1)
			 {
				 array[lIdx] = array[lIdx]-1;
				 check(lIdx+1, total, total, array);
			 }
			 else if(array[0] > 0)
			 {
				 array[0] = array[0]-1;
				 check(1, total-1, total, array);
			 }
			 
//			 array[lIdx] = num2-1;
//			 check(lIdx+1, num2-1, total, array);
			 
//			 return;
		}
		else if(sum > total)
		{
			array[idx-1] = num2-1;
			check(idx-1, num2-1, total, array);
//			return;
		}
		
//		if(num2 > 1)
		else
		{	
			array[idx] = num2-1;
			check(idx+1, num2-1, total, array);
		}
		
//		check(num1-1, total-num1, total, array);
    }
	
	private static void bin(int num) {

		
		int[] array = new int[20];
		
		int i = 0;
		while(num != 1) {
			array[i] = num % 2;
			num = num / 2;
			i++;
		}
		
		array[i] = 1;
		
		for(int j = i; j >=0; j--) {
			System.out.print(array[j]);
		}
		
    
	}
	
	private static String m2(int n) {
		String temp = "";
		if(n > 1)
		{
			temp = m2(n-1)+n+m2(n-1);
		}
		else if(n == 1)
		{
			return "1";
		}
		return temp;
	}
}
