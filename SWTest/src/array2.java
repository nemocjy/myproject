import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N =sc.nextInt();
		
		int M =sc.nextInt();
		
        int[][] array = new int[N][M]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        int A =sc.nextInt();
        
        int B =sc.nextInt();
        
        check(array, A, B);
	}
	
	private static void check(int[][] array, int num1, int num2) {
		
		System.out.print(array[num1][num2]);
		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[0].length; j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
    }
}
