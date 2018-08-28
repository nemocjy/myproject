import java.util.Scanner;

public class maxofarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[][] array = new int[9][9]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array);
	}
	
	private static void check(int[][] array) {
		
		int row = 0;
		int col = 10;
		int max = 0;
		
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		if(max < array[i][j]) {
        			max = array[i][j];
        			row = i;
        			col = j;
        		}
        	}
        }
		
		System.out.println(max);
		System.out.print(row+1+" ");
		System.out.print(col+1);
		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[0].length; j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
    }
}
