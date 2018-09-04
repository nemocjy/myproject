import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        check(A-1, A-1, A);
        	
	}
	
	private static void check(int num1, int num2, int total) {
//        System.out.println(num1-num2+"+"+num2);
		if(num1+num2 == total)
		{
			System.out.print(num2);
			if(num2 == 1)//출력 마지막 자리가 1이면 전체 숫자 변경
			{
				check(num1-1, num1-1, total);
			}
			else
			{
				check(num2)
			}
		}
		else if(num1+num2 > total)
		{
			check(num1, num2-1, total);
		}
//		else if(num1 == 1)
//		{
//			check(num1+num2, num2-1, total);
//		}
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
