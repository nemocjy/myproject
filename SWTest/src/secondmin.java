import java.util.Scanner;

public class secondmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[] array = new int[9]; 
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        check(array);
	}
	
	private static void check(int[] array) {
		
		int[] array2 = array.clone();
		
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array.length; j++) {
        		if(array[i] < array[j]) {
        			int temp = array[i];
        			array[i] = array[j];
        			array[j] = temp;
        		}
        	}
        }
		
		for(int i = 0; i < array2.length; i++) {
			if(array[1] == array2[i]) {
				System.out.println(array2[i]);
				System.out.println(i+1);
			}
		}
    }
}
