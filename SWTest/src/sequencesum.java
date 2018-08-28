import java.util.Scanner;

public class sequencesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
        int[][] array = new int[A][A]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array);
	}
	
	private static void check(int[][] array) {
		
		int[] array2 = new int[array.length];
		
//        for(int i = 0; i < array.length-1; i++) {
        	for(int j = 1; j < array[0].length; j++) {
        		if(0 == j || array[0][j-1] == 0) continue;
        		int result = array[0][j] - array[0][j-1] + array[j][j-1];
        		array2[j] = result / 2;
        	}
//        }
        
        array2[0] = array[array2.length-1][0] - array2[array2.length-1];
        array2[1] = array[0][1] - array2[0];
		
        for(int j = 0; j < array2.length; j++) {
        	System.out.print(array2[j]+" ");
        }
		
    }
}
