import java.util.Scanner;

public class inout2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[][] array = new int[10][10]; 
        
        int A =sc.nextInt();
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array, A);
	}
	
	private static void check(int[][] array, int num) {
		
		int count = 0;
		
		while(count < num) {
			for(int i = 0; i < array.length; i++) {
	        	for(int j = 0; j < array[0].length; j++) {
	        		if(j == count || i == count) {
	        			if(array[i][j] == 1) {
	        				array[i][j] = 0;
	        			} else {
	        				array[i][j] = 1;
	        			}
	        		}
	        	}
			}
			count++;
		}
		
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		System.out.print(array[i][j]+" ");
        	}
        	System.out.println();
        }
		
    }
}
