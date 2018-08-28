import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        check(A);
	}
	
	private static void check(int num) {
        
		int[][] array = new int[num][num];
		
		int count = 1;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				array[j][i-j] = count;
				count++;
			}
		}
		
//		for(int i = 0; i < num; i++) {
//			count = (i + 1) * (i + 2) / 2;
//			System.out.println("count : "+count);
//			for(int j = 0; j < num; j++) {
//			
//				if(num - i -1 < j) {
//					continue;
//				} else {
//					int result = count + j + j;
////					array[i][j] = (i+1) * (i+2) / 2 + j;
//					array[i][j] = result;
////					count++;
//				}
//			}
//			
//		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < num - i; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
    }
}
