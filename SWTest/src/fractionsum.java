import java.util.Scanner;

public class fractionsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A =sc.nextInt();
		int B =sc.nextInt();
		int C =sc.nextInt();
		int D =sc.nextInt();
        
        check(A, B, C, D);
	}
	
	private static void check(int num1, int num2, int num3, int num4) {
		
		long high = 0;
		long gcd = 0;
		long lcm = 0;
		if(num4 > num2) {
			high = num4; 
		} else {
			high = num2;
		}
		
		for(int i = 1; i <= high; i++) {
			if(num4 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		lcm = num4 * num2 / gcd;
		
		long lcm2 = lcm / num2 * num1 + lcm / num4 * num3;
		
		long high2 = lcm2 > lcm ? lcm2 : lcm; 
		
		long gcd2 = 0;
		
		for(int i = 1; i <= high2; i++) {
			if(lcm % i == 0 && lcm2 % i == 0) {
				gcd2 = i;
			}
		}
		
		long divisor = lcm2 / gcd2;
		long divided = lcm / gcd2;
		
		System.out.print(divisor+" "+divided);
    }
}
