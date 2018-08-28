import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        check(A);
	}
	
	private static void check(int num) {
        
		boolean result = true;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				if(i != 1 && i != num) {
					result = false;
				}
			}
		}
		
		if(result) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
    }
}
