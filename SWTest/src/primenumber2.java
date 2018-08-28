import java.util.Scanner;

public class primenumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        int B =sc.nextInt();

        check(A, B);
	}
	
	private static void check(int num1, int num2) {
		
		for(int i = num1; i < num2; i++) {
			if(i == 1) continue;
			
			boolean isPrimenumber = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrimenumber = false;
				}
			}
			if(isPrimenumber == true)
			System.out.print(i+" ");
		}
		
    }
}
