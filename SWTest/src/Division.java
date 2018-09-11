import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        int[] array = new int[100];
        
        check(0, A, array);
        	
	}
	
	private static void check(int idx, int total, int[]array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) break; 
			sum += array[i];
		}
		
		if(sum == total) {
			int lIdx = 0;
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				if(array[i+1] == 0) {
					lIdx = i;
					System.out.println();
					break;
				}
				else
				{
					System.out.print("+");
				}
			}

			if(array[lIdx] > 1)
			{
				array[lIdx] = array[lIdx]-1;
				array[lIdx+1] = total;
				check(lIdx+1, total, array);
			}
			else if(array[0] > 0)
			{
				array[0] = array[0]-1;
				check(1, total, array);
			}


		} else if(sum > total) {
			array[idx-1] = array[idx-1]-1;
			check(idx-1, total, array);
//			return;
		}
		
		array[idx] = array[idx-1]-1;
		check(idx+1, total, array);
		
		
	}
	
	
//	private static void check(int idx, int num2, int total, int[] array) {
////        System.out.println(num1-num2+"+"+num2);
////		System.out.println(idx);
////		for(int i=0;i<array.length;i++) {
////			System.out.print(array[i]+" ");
////		}
////		System.out.println();
//		
//		int sum = 0;
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] == 0) break; 
//			sum += array[i];
//		}
//		
//		if(sum == total) {
//			int lIdx = 0;
//			 for(int i = 0; i < array.length; i++) {
//				 System.out.print(array[i]);
//				 if(array[i+1] == 0) {
//					 lIdx = i;
//					 System.out.println();
//					 break;
//				 }
//				 else
//				 {
//					 System.out.print("+");
//				 }
//			 }
//			 
//			 if(array[lIdx] > 1)
//			 {
//				 array[lIdx] = array[lIdx]-1;
//				 check(lIdx+1, total, total, array);
//			 }
//			 else if(array[0] > 0)
//			 {
//				 array[0] = array[0]-1;
//				 check(1, total-1, total, array);
//			 }
//			 
////			 array[lIdx] = num2-1;
////			 check(lIdx+1, num2-1, total, array);
//			 
////			 return;
//		}
//		else if(sum > total)
//		{
//			array[idx-1] = num2-1;
//			check(idx-1, num2-1, total, array);
////			return;
//		}
//		
////		if(num2 > 1)
//		else
//		{	
//			array[idx] = num2-1;
//			check(idx+1, num2-1, total, array);
//		}
//		
////		check(num1-1, total-num1, total, array);
//    }
	
}
