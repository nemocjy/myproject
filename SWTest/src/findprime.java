import java.util.Scanner;

public class findprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
        int[] array = new int[A]; 
        
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        check(array);
	}
	
	private static void check(int[] array) {
		
		
		
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			boolean result = true;
			if(array[i] == 1) continue;
			for(int j = 1; j <= array[i]; j++) {
				if(array[i] % j == 0) {
					if(j != 1 && j != array[i]) {
						result = false;
					}
				}
			}
			if(result == true) {
				count++;
			}
		}
		
		System.out.println(count);
		
    }
}
