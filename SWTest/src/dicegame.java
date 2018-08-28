import java.util.Scanner;

public class dicegame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
        int[][] array = new int[A][3]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < 3; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array);
	}
	
	private static void check(int[][] array) {
		
		int [] money = new int[array.length];
		int max = 0;
		
        for(int i = 0; i < array.length; i++) {
        	if(array[i][0] == array[i][1] && array[i][0] == array[i][2]) {
        		money[i] = 10000 + array[i][0] * 1000;
        	} else if(array[i][0] == array[i][1] 
        			|| array[i][0] == array[i][2]
        			|| array[i][1] == array[i][2]) {
        		max = 0;
        		for(int j = 0; j < 3; j++) {
        			if(max < array[i][j]) {
        				max = array[i][j];
        			}
        		}
        		
        		money[i] = 1000 + max * 100;
        	} else {
        		max = 0;
        		for(int j = 0; j < 3; j++) {
        			if(max < array[i][j]) {
        				max = array[i][j];
        			}
        		}
        		
        		money[i] = max * 100;
        	}
        }
        
        max = 0;
        for(int i = 0; i < money.length; i++) {
        	if(max < money[i]) {
        		max = money[i];
        	}
        }
        
        
        System.out.println(max);
    }
}
