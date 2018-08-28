import java.util.Scanner;

public class nextnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[][] array = new int[500][3]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        	if(array[i][0] == 0 && array[i][1] == 0&& array[i][2] == 0) {
        		break;
        	}
        }
        
        check(array);
	}
	
	private static void check(int[][] array) {
		
		for(int i = 0; i < array.length; i++) {
        	if(array[i][0] == 0 && array[i][1] == 0&& array[i][2] == 0) {
        		break;
        	}
        	
        	if(array[i][2] - array[i][1] == array[i][1] - array[i][0]) {
        		System.out.print("AP ");
        		System.out.println(array[i][2] + array[i][1] - array[i][0]);
        	} else if(array[i][2] / array[i][1] == array[i][1] / array[i][0]) {
        		System.out.print("GP ");
        		System.out.println(array[i][2] * array[i][1] / array[i][0]);
        	}
		}
		
    }
}
