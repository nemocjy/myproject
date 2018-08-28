import java.util.Scanner;

public class eightnine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A =sc.nextInt();
		int B =sc.nextInt();
		
        int[][] array = new int[A][B]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array, A, B);
	}
	
	private static void check(int[][] array, int num1, int num2) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length/2; j++) {
				int temp = array[i][num2-j-1];
				array[i][num2-j-1] = array[i][j];
				array[i][j] = temp;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
    }
}
