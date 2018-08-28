import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        String[] array = new String[A]; 
        
        for(int i = 0; i < A; i++) {
        	array[i] = sc.next();
        }
        
        check(array);
	}
	
	private static void check(String[] array) {
		
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]+" ");
		}
    }
}
