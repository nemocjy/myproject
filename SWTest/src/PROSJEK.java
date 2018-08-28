import java.util.Scanner;

public class PROSJEK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
        int[] array = new int[A]; 
        
        
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt() * (i+1);
        }
        
        check(array);
	}
	
	private static void check(int[] array) {
		int[] array2 = new int[array.length];
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum = array[i];
			for(int j = 0; j < i; j++) {
				sum = sum - array2[j];
			}
			array2[i] = sum;
			
		}
		
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]);
			System.out.print(" ");
		}
		
    }
}
