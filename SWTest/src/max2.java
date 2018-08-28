import java.util.Scanner;

public class max2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//        int A =sc.nextInt();
        
        int[] array = new int[9]; 
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        check(array);
	}
	
	private static void check(int[] array) {
		
		int max = array[0];
		int pos = 0;
		
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				pos = i;
			}
		}
        System.out.println(max);
        System.out.println(pos+1);
    }
}
