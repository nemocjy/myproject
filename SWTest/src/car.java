import java.util.HashMap;
import java.util.Scanner;

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
        int[] array = new int[5]; 
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        check(A, array);
	}
	
	private static void check(int day, int[] array) {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(day == array[i]) count++;
		}
		
		System.out.print(count);
		
    }
}
