import java.util.Scanner;

public class numberbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		
        int[] array = new int[A]; 
        
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        int B = sc.nextInt();
        
        int[] array2 = new int[B];
        
        for(int i = 0; i < array2.length; i++) {
        	array2[i] = sc.nextInt();
        }
        
        if(array.length > array2.length)
        {
        	check(array, array2);	
        }
        else
        {
        	check(array2, array);
        }
        
        
	}
	
	private static void check(int[] array, int[] array2) {
		
		for(int i = 0; i < array.length; i++)
		{
			boolean result = false;
			for(int j = 0; j < array2.length; j++)
			{
				if(array[i] == array2[j]) {
					result = true;
					break;
				}
			}
			
			if(result)
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(0);
			}
		}
    }
}
