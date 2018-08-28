import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        check(A);
	}
	
	private static void check(int num) {
        
		if(num % 400 == 0) {
			System.out.println("YES");
		}else if(num % 4 == 0 && num % 100 != 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
    }
}
