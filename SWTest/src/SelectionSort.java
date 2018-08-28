import java.util.HashMap;
import java.util.Scanner;

public class SelectionSort {

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
			int index = i;
			for(int j = i; j < array.length; j++) {
				if(array[index] > array[j]) {
					index = j;
				}
			}
			
			int temp = array[i];//swap
			array[i] = array[index];
			array[index] = temp;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
    }
}
