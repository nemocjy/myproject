import java.util.Scanner;

public class tri3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        check(A);
	}
	
	private static void check(int num) {
		
		for(int i = 0; i < num; i++) {
			for(int j = 1; j < num - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
    }
}
