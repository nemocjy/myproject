import java.util.Scanner;

public class mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        check(A);
	}
	
	private static void check(int top) {
        
		System.out.println(m2(top));
//		System.out.print(mountain(top-1)+top+mountain(top-1));
		
    }
	
	private static String mountain(int n) {
		String temp = "1";
		return mountain(n);
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
