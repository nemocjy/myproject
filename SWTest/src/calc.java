import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        String str =sc.next();
        
        int B =sc.nextInt();
        
        check(A, str, B);
	}
	
	private static void check(int num1, String str, int num2) {
        
		if("+".equals(str)) {
			System.out.println(num1 + num2);
		} else if("-".equals(str)) {
			System.out.println(num1 - num2);
		} else if("*".equals(str)) {
			System.out.println(num1 * num2);
		} else if("/".equals(str)) {
			System.out.println(num1 / num2);
		}
		
    }
}
