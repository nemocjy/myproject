import java.util.Scanner;

public class tobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        int B =sc.nextInt();

        int[] array = new int[A];
        
        check(array, B);
	}
	
	private static void check(int[] array, int num2) {
        
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[j] == 0)
				{
					array[j] = 1;
				}
				else
				{
					array[j] = 0;
				}
				
				for(int l = 0; l < array.length; l++) {
					System.out.print(array[l]);
				}
				System.out.println();
			}
			
			
			System.out.println();
			
//			int count = 0;
//			for(int k = 0; k < array.length; k++) {
//				if(array[k] == 1) count++;
//			}
			
//			if(count == num2)
//			{
//				for(int l = 0; l < array.length; l++) {
//					System.out.print(array[l]);
//				}
//				System.out.println();
//			}
		}
		
		
		
//		System.out.println(m2(top));
//		System.out.print(mountain(top-1)+top+mountain(top-1));
		
    }
	
	private static void bin(int num) {

		
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
	
	private static String m2(int n) {
		String temp = "";
		if(n > 1)
		{
			temp = m2(n-1)+n+m2(n-1);
		}
		else if(n == 1)
		{
			return "1";
		}
		return temp;
	}
}
