import java.util.Scanner;

public class streetree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A =sc.nextInt();
		
        int[] array = new int[A-1];
        
        int temp = sc.nextInt();
        
        for(int i = 0; i < array.length; i++) {
        	int temp2 = sc.nextInt();
        	array[i] = temp2 - temp;
        	temp = temp2;
        	
        }
        
        check(array);
	}
	
	private static int getGcd(int gcd, int num) {
		if(num == 0) {
			return gcd;
		}
		else
		{
			return getGcd(num, gcd % num);
		}
	}
	
	private static void check(int[] array) {
		
		int lcm = array[0];
		
		for(int i = 1; i < array.length; i++) {
			lcm = getGcd(lcm, array[i]);
		}
		
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += array[i]/lcm - 1; 
		}
		
		System.out.print(total);
    }
}
