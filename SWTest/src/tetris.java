import java.util.Scanner;

public class tetris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A =sc.nextInt();
		int B =sc.nextInt();
		
        int[][] array = new int[B][A]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array, A, B);
	}
	
	private static void check(int[][] array, int num1, int num2) {
		
		int[] array2 = new int[num2];
		
		
		int idx = -1;
		for(int i = 0; i < array.length; i++) {
			int count = 0;
			for(int j = 0; j < array[0].length; j++) {
				if(array[i][j] == 1) {
					count++;
				}
			}
			if(count == num1-1) {
				int row = -1;
				for(int k = 0; k < array[0].length; k++) {
					if(array[i][k] == 0) {
						row = k;
						break;
					}
				}
				
				boolean result = true;
				for(int l = i; l >= 0; l--) {
					if(array[l][row] == 1) {
						result = false;
					}
				}
				
				if(result) {
					array2[i] = 1;
					if(row > idx) {
						idx = row;
					}
				}
			}
		}
		
		boolean hasSpace = false;
		
		if(idx != -1) {
			for(int i = 0; i < array[0].length; i++) {
				int empty = 0;
				for(int j = 0; j < array.length; j++) {
					if(array[j][i] == 0) {
						empty++;
					}
				}
				if(empty >= 4) {
					hasSpace = true;
				}
			}
			
			if(hasSpace == false) {
				System.out.print(0+" ");
				System.out.print(0);
				return;
			}

		}
		
		int count = 0;
		for(int i = 0; i < array2.length; i++) {
			if(array2[i] == 1 && count < 4) {
				count++;
			} 
		}
		
		System.out.print(idx+1+" "+count);
		
    }
}
