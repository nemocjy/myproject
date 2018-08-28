import java.util.Scanner;

public class fmttalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		int B =sc.nextInt();
		
        check(B-A);
	}
	
	private static void check(int distance) {
		int count = 1;
		int total = 0;
		while(total < distance) {
			count++;
			total += (count/2);
		}
		
		System.out.print(count-1);

	}
	
}
