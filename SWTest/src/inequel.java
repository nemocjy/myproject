import java.util.Scanner;

public class inequel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        end = A+1;
        array = new String[A];
        array2 = new int[2][A+1];
        for(int i = 0; i < array.length; i++)
        {
        	array[i] = sc.next();
        }
        
        int[] array3 = new int[A+1];
        for(int i = 0; i < array3.length; i++)
        {
        	array2[0][i] = -1;
        	array2[1][i] = -1;
        	array3[i] = -1;
        }
        
        check(array3, 0);
        
        for(int i = 0; i < array2[1].length; i++)
        {
        	System.out.print(array2[1][i]);
        }
        
        System.out.println();
        
        for(int i = 0; i < array2[0].length; i++)
        {
        	System.out.print(array2[0][i]);
        }
//        System.out.print(count);
        	
	}
	static int end = 0;
	static int count = 0;
	static String[] array;
	static int[][] array2;
	
	private static void check(int[] array3, int total)
	{
		
		if(total == end)
		{
			String cur = "";
			String min = "";
			String max = "";
			
			int[] check = new int[10];
			
	        for(int i = 0; i < check.length; i++)
	        {
	        	check[i] = -1;
	        }
	        
			for(int i = 0; i < array3.length; i++)
			{
				for(int j = 0; j < 10; j++)
				{
					
					if(array3[i] == j)
					{
						if(check[j] != -1)
						{
							return;
						}
						else
						{
							check[j] = j;
						}
					}
				}
			}
			
			for(int i = 0; i < array.length; i++)
			{
				String op = array[i];
				if(op.equals(">"))
				{
					if(array3[i] < array3[i+1])
					{
						return;
					}
				}
				else
				{
					if(array3[i] > array3[i+1])
					{
						return;
					}
				}
			}
			
			if(array2[0][0] == -1)
			{
				for(int i = 0; i < total; i++)
				{
					array2[0][i] = array3[i];
					array2[1][i] = array3[i];
				}
			}
			else
			{
				
				
				
//				for(int i = 0; i < array.length; i++)
//				{
//					String op = array[i];
//					if(op.equals(">"))
//					{
//						if(array3[total-1] > i)
//						{
//							boolean res = true; 
//							for(int j = 0; j < array3.length; j++)
//							{
//								if(array3[j] == i)
//								{
//									res = false;
//									break;
//								}
//							}
//
//							if(res == true)
//							{
//								array3[total] = i;
//								check(array3, total + 1);
//							}
//						}
//					}
//					else
//					{
//						if(array3[total-1] < i)
//						{
//
//							boolean res = true; 
//							for(int j = 0; j < array3.length; j++)
//							{
//								if(array3[j] == i)
//								{
//									res = false;
//									break;
//								}
//							}
//
//							if(res == true)
//							{
//								array3[total] = i;
//								check(array3, total + 1);
//							}
//						}
//					}
//				}
				
//				for(int i = 0; i < array2[1].length; i++)
//		        {
//		        	System.out.print(array3[i]);
//		        }
//		        System.out.println();
				
				
				
				
				for(int i = 0; i < total; i++)
				{
					cur += String.valueOf(array3[i]);
					min += String.valueOf(array2[0][i]);
					max += String.valueOf(array2[1][i]);
				}
				
				if(Long.parseLong(cur) < Long.parseLong(min))
				{
					for(int i = 0; i < total; i++)
					{
						array2[0][i] = array3[i];
					}
				}
				else if(Long.parseLong(cur) > Long.parseLong(max))
				{
					for(int i = 0; i < total; i++)
					{
						array2[1][i] = array3[i];
					}
				}
			}
		}
		else
		{
			for(int i = 0; i < 10; i++)
			{
//				if(total == 0) {
					array3[total] = i;
					check(array3, total + 1);
//				}
//				else
//				{
//					String op = array[total-1];
//					if(op.equals(">"))
//					{
//						if(array3[total-1] > i)
//						{
//							boolean res = true; 
//							for(int j = 0; j < array3.length; j++)
//							{
//								if(array3[j] == i)
//								{
//									res = false;
//									break;
//								}
//							}
//							
//							if(res == true)
//							{
//								array3[total] = i;
//								check(array3, total + 1);
//							}
//						}
//					}
//					else
//					{
//						if(array3[total-1] < i)
//						{
//							
//							boolean res = true; 
//							for(int j = 0; j < array3.length; j++)
//							{
//								if(array3[j] == i)
//								{
//									res = false;
//									break;
//								}
//							}
//							
//							if(res == true)
//							{
//								array3[total] = i;
//								check(array3, total + 1);
//							}
//						}
//					}
//				}
			}
			
//			total++;
//			check(array3, total);
		}
		
//		for(int i = 0; i < 10; i++) {
//			
////			check(array3);
//			for(int j = 0; j < array3.length; j++) {
//				if(array3[j] == -1) {
//					array3[j] = i;
//				}
//			}
//		}
		
	}
	
	
//	private static void check(int num)
//	{
//		int isFinish = 0;
//		for(int i = 0; i < end-1; i++)
//		{
//			if(".".equals(array[i]))
//			{
//				isFinish++;
//			}
//			else
//			{
//				break;
//			}
//			
//		}
//		if(isFinish == end-1) return;
//		if(num == end)
//		{
//			
//			int total = 1;
////			int sum = 0;
//			for(int i = 2; i <= end; i++)
//			{
//				String op = array[i-2];
//				switch(op) {
//				case "+":
//					if(i - 1 <= array.length - 1) {
//						String op2 = array[i-1];
//						if(".".equals(op2)) {
//							String temp = String.valueOf(i);
//							temp += String.valueOf(i+1);
//							int sum = Integer.parseInt(temp);
//							total += sum;
//							i++;
//						}
//						else
//						{
//							total += i;
//						}
//					}
//					else
//					{
//						total += i;
//					}
////					if(sum != 0) {
////						total += sum + i;
////						sum = 0; 
////					}
////					else
////					{
////						total += i;
////					}
//					break;
//				case "-":
//					if(i - 1 <= array.length - 1) {
//						String op2 = array[i-1];
//						if(".".equals(op2)) {
//							String temp = String.valueOf(i);
//							temp += String.valueOf(i+1);
//							int sum = Integer.parseInt(temp);
//							total -= sum;
//							i++;
//						}
//						else
//						{
//							total -= i;
//						}
//					}
//					else
//					{
//						total -= i;
//					}
////					if(sum != 0) {
////						total += sum - i;
////						sum = 0; 
////					}
////					else
////					{					
////						total -= i; 
////					}
//					break;
//				case ".":
////					if(sum != 0) {
////						String temp = String.valueOf(sum);
////						temp += String.valueOf(i);
////						sum = Integer.parseInt(temp);
////					}
////					else
////					{
////						String temp = String.valueOf(i-1);
////						temp += String.valueOf(i);
////						sum = Integer.parseInt(temp);
////						if(i == end)
////						{
////							
////						}
////					}
//					break;
//				}
//			}
//			if(total == 0)
//			{
//				for(int i = 1; i <= end; i++) {
//					System.out.print(i+" ");
//					if(i != end)
//					System.out.print(array[i-1]+" ");
//				}
//				count++;
//				System.out.println();
//			}
////			for(int i = 1; i <= end-1; i++)
////			{
////				System.out.print(i+" ");
////				System.out.print(array[i-1]+" ");
////			}
////			System.out.print(end+" = "+total);
////			
////			System.out.println();
//			
////			check(num-1);
//		}
//		else
//		{
//			
////			String op = array[num-1];
////			if(op != null)
////			{
////				switch(op) {
////				case "+":
////					array[num-1] = "-";
////					break;
////				case "-":
////					array[num-1] = ".";
////					break;
////				case ".":
////					//				array[num-1] = "+";
////					check(num-1);
////					return;
////				default:
////					array[num-1] = "+";
////
////				}
////			}
////			else
////			{
////				array[num-1] = "+";
////			}
//			array[num-1] = "+";
//			check(num+1);
//			array[num-1] = "-";
//			check(num+1);
//			array[num-1] = ".";
//			check(num+1);
//		}
//	}
	
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
