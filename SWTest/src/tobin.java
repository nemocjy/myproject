import java.util.Scanner;

public class tobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        int B =sc.nextInt();
        
        int[] array = new int[100];

        check(0, 0, A, B, array);
	}
	
	private static void check(int num1, int num2, int n, int k, int[] array) {
		if(num1 >= n) {
			if(num2 == k) {
				for(int i = 0; i < n; i++) {
					System.out.print(array[i]);
				}
				System.out.println();
			}
			return;
		}
		
		if(num2 < k) {
			array[num1] = 1;
			check(num1+1, num2+1, n, k, array);
		}
		
		array[num1] = 0;
		check(num1+1, num2, n, k, array);
		
	}
	
}
