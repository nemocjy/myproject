import java.util.Scanner;

public class tri2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        check(A);
	}
	
	private static void check(int num) {
        
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				
				if(num - i < j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
    }
}
