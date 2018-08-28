import java.util.Scanner;

public class colorpaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
        int[][] array = new int[A][4]; 
        
        
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array);
	}
	
	private static void check(int[][] array) {
		
		int[][] array2 = new int[101][101]; 
		int count = 1;
		
		for(int i = 0; i < array.length; i++)
		{
			int height = array[i][1]+array[i][3];
			int width = array[i][0]+array[i][2];
			
			for(int j = 100-array[i][1]; j > 100-height; j--) {
				for(int k = array[i][0]; k < width; k++) {
					array2[j][k] = count;
				}
			}
			count++;
		}
		
		int[] array3 = new int[count];
		
		while(count > 0) {

			for(int i = 0; i < 101; i++) {
				for(int j = 0; j < 101; j++) {
//					System.out.print(array2[i][j]+" ");
					if(array2[i][j] == count) {
						array3[count]++;
					}
				}
//				System.out.println();
			}
			count--;
//			System.out.println();
		}
		
		for(int j = 1; j < array3.length; j++) {
//			if(array3[j] != 0)
				System.out.println(array3[j]);
		}
		
		
    }
}
