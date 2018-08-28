import java.util.HashMap;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
        int[][] array = new int[A][5]; 
        
        for(int i = 0; i < array.length; i++) {
        	array[i][0] = sc.nextInt();
        	array[i][3] = sc.nextInt();
        	array[i][4] = sc.nextInt();
        	
        	array[i][2] = array[i][0] % 10;
        	array[i][1] = (array[i][0] % 100) /10;
        	array[i][0] = array[i][0] /100;
        }
        
        check(array, A);
	}
	
	private static void check(int[][] array, int num) {
		int result = 0;
		for(int j = 123; j <= 987; j++) {
			int count = 0;
			for(int i = 0; i < array.length; i++) {
				int strike = 0;
				int ball = 0;
				int hun = j /100;
				int ten = (j % 100) / 10;
				int one = j % 10;
				
				if(hun == 0 || ten == 0 || one == 0||
						hun == ten || ten == one || hun == one)
					continue;

				if(array[i][0] == hun) {
					strike++;
				} else if(array[i][1] == hun || array[i][2] == hun) {
					ball++;
				}
				
				if(array[i][1] == ten) {
					strike++;
				} else if(array[i][0] == ten || array[i][2] == ten) {
					ball++;
				}
				
				if(array[i][2] == one) {
					strike++;
				} else if(array[i][0] == one || array[i][1] == one) {
					ball++;
				}

				if(strike == array[i][3] && ball == array[i][4]) {
					count++;
				}
			}
			
			if(num == count) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
