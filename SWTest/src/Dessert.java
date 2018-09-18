import java.util.Scanner;

public class Dessert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        end = A;
        array = new String[A-1];
        
        check(1);
        
        System.out.print(count);
        	
	}
	static int end = 0;
	static int count = 0;
	static String[] array;
	
	
	private static void check(int num)
	{
		int isFinish = 0;
		for(int i = 0; i < end-1; i++)
		{
			if(".".equals(array[i]))
			{
				isFinish++;
			}
			else
			{
				break;
			}
			
		}
		if(isFinish == end-1) return;
		if(num == end)
		{
			
			int total = 1;
//			int sum = 0;
			for(int i = 2; i <= end; i++)
			{
				String op = array[i-2];
				switch(op) {
				case "+":
					if(i - 1 <= array.length - 1) {
						String op2 = array[i-1];
						if(".".equals(op2)) {
							String temp = String.valueOf(i);
							temp += String.valueOf(i+1);
							int sum = Integer.parseInt(temp);
							total += sum;
							i++;
						}
						else
						{
							total += i;
						}
					}
					else
					{
						total += i;
					}
//					if(sum != 0) {
//						total += sum + i;
//						sum = 0; 
//					}
//					else
//					{
//						total += i;
//					}
					break;
				case "-":
					if(i - 1 <= array.length - 1) {
						String op2 = array[i-1];
						if(".".equals(op2)) {
							String temp = String.valueOf(i);
							temp += String.valueOf(i+1);
							int sum = Integer.parseInt(temp);
							total -= sum;
							i++;
						}
						else
						{
							total -= i;
						}
					}
					else
					{
						total -= i;
					}
//					if(sum != 0) {
//						total += sum - i;
//						sum = 0; 
//					}
//					else
//					{					
//						total -= i; 
//					}
					break;
				case ".":
//					if(sum != 0) {
//						String temp = String.valueOf(sum);
//						temp += String.valueOf(i);
//						sum = Integer.parseInt(temp);
//					}
//					else
//					{
//						String temp = String.valueOf(i-1);
//						temp += String.valueOf(i);
//						sum = Integer.parseInt(temp);
//						if(i == end)
//						{
//							
//						}
//					}
					break;
				}
			}
			if(total == 0)
			{
				for(int i = 1; i <= end; i++) {
					System.out.print(i+" ");
					if(i != end)
					System.out.print(array[i-1]+" ");
				}
				count++;
				System.out.println();
			}
//			for(int i = 1; i <= end-1; i++)
//			{
//				System.out.print(i+" ");
//				System.out.print(array[i-1]+" ");
//			}
//			System.out.print(end+" = "+total);
//			
//			System.out.println();
			
//			check(num-1);
		}
		else
		{
			
//			String op = array[num-1];
//			if(op != null)
//			{
//				switch(op) {
//				case "+":
//					array[num-1] = "-";
//					break;
//				case "-":
//					array[num-1] = ".";
//					break;
//				case ".":
//					//				array[num-1] = "+";
//					check(num-1);
//					return;
//				default:
//					array[num-1] = "+";
//
//				}
//			}
//			else
//			{
//				array[num-1] = "+";
//			}
			array[num-1] = "+";
			check(num+1);
			array[num-1] = "-";
			check(num+1);
			array[num-1] = ".";
			check(num+1);
		}
	}
	
//	private static void check(int idx, int total, int[]array) {
//		int sum = 0;
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] == 0) break; 
//			sum += array[i];
//		}
//		
//		if(sum == total) {
//			int lIdx = 0;
//			for(int i = 0; i < array.length; i++) {
//				System.out.print(array[i]);
//				if(array[i+1] == 0) {
//					lIdx = i;
//					System.out.println();
//					break;
//				}
//				else
//				{
//					System.out.print("+");
//				}
//			}
//
//			count++;
//		} 
//		else if(sum > total) 
//		{
//			array[idx] = array[idx]-1;
//			check(idx, total, array);
//		}
//		else
//		{
//			array[idx+1] = array[idx];
//			check(idx+1, total, array);
//		}
//	}
	
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
			
			count++;

			if(array[lIdx] > 1)
			{
				array[lIdx] = array[lIdx]-1;
				array[lIdx+1] = total;
				check(lIdx+1, total, array);
			}
			else if(array[0] > 1)
			{
				array[0] = array[0]-1;
				check(0, total, array);
			}


		} else if(sum > total) {
			array[idx] = array[idx]-1;
			check(idx, total, array);
//			return;
		} else {
			
			
			array[idx+1] = array[idx];
			check(idx+1, total, array);
		}
		
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
