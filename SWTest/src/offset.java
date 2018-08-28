import java.util.Scanner;

public class offset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int[][] array = new int[5][5]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array);
	}
	
	private static void check(int[][] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				
				int result = 0;
				
				if(i > 0) {
					if(array[i-1][j] > array[i][j]) {
						result++;
					}
				} else {
					result++;
				}
				
				if(i < 4) {
					if(array[i+1][j] > array[i][j]) {
						result++;
					}
				} else {
					result++;
				}
				
				if(j > 0) {
					if(array[i][j-1] > array[i][j]) {
						result++;
					}
				} else {
					result++;
				}
				
				if(j < 4) {
					if(array[i][j+1] > array[i][j]) {
						result++;
					}
				} else {
					result++;
				}
				
				if(result == 4) {
					System.out.print("* ");
				} else {
					System.out.print(array[i][j]+" ");
				}
				
			}
			System.out.println();
		}
    }
}
