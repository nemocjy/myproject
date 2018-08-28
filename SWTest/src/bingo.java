import java.util.Scanner;

public class bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int[][] array = new int[5][5]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        int[] array2 = new int[25];
        
        for(int i = 0; i < 25; i++) {
        	array2[i] = sc.nextInt();
        }
        
        check(array, array2);
	}
	
	private static void check(int[][] array, int[] array2) {
		
		for(int k = 0; k < array2.length; k++) {
			int count = 0;
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[0].length; j++) {
					if(array[i][j] == array2[k]) {
						array[i][j] = 0;
					}
				}
			}
			
			if(k < 12) continue;
			
			for(int i = 0; i < array.length; i++) {
				int row = 0;
				for(int j = 0; j < array[0].length; j++) {
					if(array[i][j] == 0) {
						row++;
					}
				}
				if(row == 5) count++;
			}
			
			for(int i = 0; i < array.length; i++) {
				int column = 0;
				for(int j = 0; j < array[0].length; j++) {
					if(array[j][i] == 0) {
						column++;
					}
				}
				if(column == 5) count++;
			}
			
			int x = 0;
			for(int i = 0; i < 5; i++) {
				if(array[i][i] == 0) {
					x++;
				}
				if(x == 5) count++;
			}
			
			x = 0;
			for(int i = 0; i < 5; i++) {
				if(array[i][4-i] == 0) {
					x++;
				}
				if(x == 5) count++;
			}
			
			
			if(count >= 3) {
				System.out.print(k+1);
				return;
			}
		}
    }
}
