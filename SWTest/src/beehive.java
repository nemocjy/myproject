import java.util.Scanner;

public class beehive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A =sc.nextInt();
		
        
        check(A);
	}
	
	private static void check(int num) {
		
		int count = 1;
		int total = 1;
		int temp = 1;
		while(true) {
			if(total >= num) {
				break;
			}
			temp = 6 * (count++);
			total += temp;
		}
		
		System.out.print(count);
		
    }
}
