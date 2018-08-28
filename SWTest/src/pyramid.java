import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        int B =sc.nextInt();
        
        check(A, B);
	}
	
	private static void check(int num1, int num2) {
		int[] array = new int[(num1-1)*2+1];
		
		for(int i = 0; i < num1; i++) {
			for(int j = 1; j < num1 - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i * 2 + 1; k++) {
				if(num2 > 9) num2 = 1;
				array[k] = num2;
				num2++;
			}
			
			if(i % 2 == 0) {
				for(int l = i * 2; l >= 0; l--) {
					System.out.print(array[l]);
				}
			} else {
				for(int l = 0; l < i * 2 + 1; l++) {
					System.out.print(array[l]);
				}
			}
			
			System.out.println();
		}
    
    }
}
