import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
//		int B =sc.nextInt();
//		int A =sc.nextInt();
		
        
        check(A);
	}
	
	private static void check(int num1) {
		int a = 0;
		int b = 1;
		int result = 0;
		
		if(num1 == 1) {
			System.out.print(1);
			return;
		}
		for(int i = 1; i < num1; i++) {
			result = a+b;
			a = b;
			b = result;
			
		}
		System.out.print(result);
    }
}
