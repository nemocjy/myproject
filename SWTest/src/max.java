import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        int B =sc.nextInt();
        
        int C =sc.nextInt();
        
        check(A, B, C);
	}
	
	private static void check(int a, int b, int c) {
        
        int[] array = new int[3];
        
        array[0] = a;
        array[1] = b;
        array[2] = c;
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array.length; j++) {
        		if(array[i] < array[j]) {
        			int temp = array[i];
        			array[i] = array[j];
        			array[j] = temp;
        		}
        	}
        }
        
        System.out.println(array[2]);
    }
}
