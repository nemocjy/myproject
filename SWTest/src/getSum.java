import java.util.HashMap;
import java.util.Scanner;

public class getSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		int B =sc.nextInt();
		
        
        System.out.println(check(A, B));
	}
	
	private static int check(int n, int m) {
		if(n == m)
			return n;
		else
			return check(n, m-1)+m;
	}
}
