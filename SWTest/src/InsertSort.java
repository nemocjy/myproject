import java.util.HashMap;
import java.util.Scanner;

public class InsertSort {

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
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i; j >= 1; j--) {
				if(array[j-1] > array[j]) {
					int temp = array[j-1];//swap
					array[j-1] = array[j];
					array[j] = temp;
				} else {
					break;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
    }
}
