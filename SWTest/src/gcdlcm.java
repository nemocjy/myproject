import java.util.Scanner;

public class gcdlcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A =sc.nextInt();
		int B =sc.nextInt();
        
        check(A, B);
	}
	
	private static void check(int num1, int num2) {
		int high = 0;
		int gcd = 0;
		int lcm = 0;
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
		System.out.println(gcd);
		
		lcm = num1 * num2 / gcd;
		
		System.out.println(lcm);
    }
}
