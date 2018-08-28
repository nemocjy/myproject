import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
        check(A);
	}
	
	private static void check(int num) {
		
		int[] array = new int[20];
		
		int i = 0;
		while(num != 1) {
			array[i] = num % 2;
			num = num / 2;
			i++;
		}
		
		array[i] = 1;
		
		for(int j = i; j >=0; j--) {
			System.out.print(array[j]);
		}
		
    }
	
}
