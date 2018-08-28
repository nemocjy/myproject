import java.util.Scanner;

public class combinationzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		int B =sc.nextInt();

		check(A, B);
		
	}

	private static void check(int num1, int num2) {

		int a2 = 0;
		int a5 = 0;
		int b2 = 0;
		int b5 = 0;
		int c2 = 0;
		int c5 = 0;
		
		for(int i = 2; i <= num1; i *= 2) {
			a2 += num1 / i;
		}
		
		for(int i = 5; i <= num1; i *= 5) {
			a5 += num1 / i;
		}
		
		for(int i = 2; i <= num2; i *= 2) {
			b2 += num2 / i;
		}
		
		for(int i = 5; i <= num2; i *= 5) {
			b5 += num2 / i;
		}
		
		for(int i = 2; i <= num1-num2; i *= 2) {
			c2 += (num1-num2) / i;
		}
		
		for(int i = 5; i <= num1-num2; i *= 5) {
			c5 += (num1-num2) / i;
		}
		
		int result2 = a2-b2-c2;
		int result5 = a5-b5-c5;
		
		System.out.print(result2 > result5 ? result5 : result2);
		
	}
}
