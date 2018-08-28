import java.util.Scanner;

public class point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
        int[] array = new int[A]; 
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        check(array);
	}
	
	private static void check(int[] array) {
		
		int result = 0;
		int point = 0;
        for(int i = 0; i < array.length; i++) {
        	if(array[i] == 1) {
        		point++;
        	} else {
        		point = 0;
        	}
        	result += point;
        }
        
        System.out.println(result);
    }
}
