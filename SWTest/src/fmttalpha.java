import java.util.Scanner;

public class fmttalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		int B =sc.nextInt();
		
        check(B-A);
	}
	
	private static void check(int distance) {
		int count = 1;
		int total = 0;
		while(total < distance) {
			count++;
			total += (count/2);
		}
		
		System.out.print(count-1);

	}
	
//	private static void check(int start, int end) {
//		int distance = end - start;
//		int powN = 0;
//		int minN = 0;
//		int maxN = 0;
//		int warp = 0;
//		int i = 1;
//		while(true) {
//			warp++;
//			
//			start += warp;
//			
//			
//			powN = i * i;
//			minN = powN - i + 1;
//			maxN = powN + 1 + i -1;
//			if(minN <= distance && distance <= maxN) {
//				if(minN <= distance && distance <= powN) 
//				{
//					warp = (i<<1) - 1;
//				}
//				else 
//				{
//					warp = i<<1;
//				}
//				break;
//			}
//			i++;
//		}
//		
//		
////		int jump = 0;
////		int count = 0;
////		int goal = num2 - num1 - 1;
////		while(true) {
//////			num2 = num2 - jump+1;
////			if(jump + 1 == goal) {
////				count++;
////				break;
////			} else {
////				goal = goal - jump + 1;
////			}
////			count++;
////			jump++;
////		}
////		System.out.print(count+1);
//    }
}
