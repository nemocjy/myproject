import java.util.Scanner;

public class goodseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        end = A;
        
        check(1, "1");
        	
	}
	static int end = 0;
	static boolean exit = false;
	
	private static void check(int num, String str)
	{
		if(exit) {
			return;
		}
		
		if(num == end) {
			exit = true;
			System.out.println(str);
		}
		else
		{
			for(int i = 1; i <= 3; i++)
			{
				if(check2(str+i))
				{
					check(num+1, str+i);
				}
			}
		}
	}
	
	private static boolean check2(String str)
	{
		int length = str.length();
		int half = length / 2;
		int start = length -1;
		int end = length;
		
		for(int i = 1; i <= half; i++) 
		{
			if(str.substring(start - i,  end - i).equals(str.substring(start, end)))
			{
				return false;
			}
			start -= 1;
		}
		return true;
	}
	
	
}
