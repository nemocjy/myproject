import java.util.Scanner;

public class play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int[][] array = new int[3][4]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array);
	}
	
	private static void check(int[][] array) {
        for(int i = 0; i < array.length; i++) {
        	int result = 0;
        	for(int j = 0; j < array[0].length; j++) {
        		result += array[i][j];
        	}
        	
            switch(result) {
            case 0://yut
            	System.out.println("D");
            	break;
            case 1://gul
            	System.out.println("C");
            	break;
            case 2://gae
            	System.out.println("B");
            	break;
            case 3://do
            	System.out.println("A");
            	break;
            case 4://mo
            	System.out.println("E");
            	break;

            }
        }
		
    }

}
