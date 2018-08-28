import java.util.Scanner;

public class attackrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();
        int D =sc.nextInt();
        
        int[][] array = new int[A][A]; 
        
        check(array, B, C, D);
	}
	
	private static int abs(int num) {
		return num > 0? num : num * -1;
	}
	
	private static void check(int[][] array, int x, int y, int range) {
		int posX = x-1;
		int posY = y-1;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				if(i == posX && j == posY) {
					array[i][j] = 100;
				} else {
					int temp = 0;
					temp = abs(posX-i)+abs(posY-j);
					if(temp == 0) {
						System.out.println();
					}
					if(temp <= range)
					array[i][j] = temp;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				if(array[i][j] == 100) {
					System.out.print("x");
				} else {
					System.out.print(array[i][j]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
    }
}
