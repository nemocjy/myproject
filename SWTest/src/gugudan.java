import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        check(A);
	}
	
	private static void check(int num) {
        
		for(int i = 1; i <= 9; i++) {
			int result = num * i;
			System.out.println(num+"*"+i+"="+result);
		}
    }
}
