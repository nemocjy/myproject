import java.util.HashMap;
import java.util.Scanner;

public class seat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int col =sc.nextInt();
		int row =sc.nextInt();
		int num =sc.nextInt();
		
		if(col * row < num) {
			System.out.println(0);
			return;
		}
		
        int[][] array = new int[row][col]; 
        
        check(array, row, col, num);
	}
	
	private static void check(int[][] array, int row, int col, int num) {
		int x = row-1;
		int y = 0;
		
		int number = row * col;
		
		int seat = 1;
		
		int posx = 0;
		int posy = 1;
		
		int posxEnd = row - 1;
		int posyEnd = col - 1;
		
		while(seat <= number) {
			
			for(; x > posx; x--) {
				array[x][y] = seat++;
			}
			
			if(seat == number) break;
			
			posx++;
			
			for(; y < posyEnd; y++) {
				array[x][y] = seat++;
			}
			
			if(seat == number) break;
			
			posyEnd--;
			
			for(; x < posxEnd; x++) {
				array[x][y] = seat++;
			}
			
			if(seat == number) break;
			
			posxEnd--;
			
			for(; y > posy; y--) {
				array[x][y] = seat++;
			}
			
			posy++;
		}
		
		array[x][y] = seat;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(array[i][j] == num) {
					System.out.print(j+1+" ");
					System.out.print(row-i);
					return;
				}
			}
		}
		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[0].length; j++) {
//				//System.out.print(array[i][j]+" ");
//			}
//			//System.out.println();
//		}
	}
}
