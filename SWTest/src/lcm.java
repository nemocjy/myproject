import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long A =sc.nextInt();
		long B =sc.nextInt();
        
        check(A, B);
	}
	
	private static void check(long num1, long num2) {
		long high = 0;
		long gcd = 0;
		long lcm = 0;
		if(num1 > num2) {
			high = num1; 
		} else {
			high = num2;
		}
		
		for(int i = 1; i <= high; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
//		System.out.println(gcd);
		
		lcm = num1 * num2 / gcd;
		
		System.out.println(lcm);
    }
}
