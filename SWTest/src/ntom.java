import java.util.Scanner;

public class ntom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        int B =sc.nextInt();

        check(A, B);
	}
	
	private static void check(int num1, int num2) {
        
		int sp = 1;
		
		for(int i = num1; i <= num2; i++) {
			System.out.print(i+" ");
			if(sp % 8 == 0) {
				System.out.println();
			}
			sp++;
		}
    }
}
