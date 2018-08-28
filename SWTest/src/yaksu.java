import java.util.Scanner;

public class yaksu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        int B =sc.nextInt();

        check(A, B);
	}
	
	private static void check(int num1, int num2) {
        
		int index = 0;
		
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0) {
				index++;
				if(index == num2) {
					System.out.println(i);
					return;
				}
				
			}
			
			if(num1 == i && index < num2) {
				System.out.println(0);
			}
		}
    }
}
