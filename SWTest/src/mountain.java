import java.util.Scanner;

public class mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        check(A);
	}
	
	private static void check(int top) {
        
		int num = 3;
		boolean isSummit = false; 
		
		if(top == 3) {
			System.out.print("1213121");
			return;
		}
		
		String result = "";
		
		while(true) {
			result+="1213";
//			System.out.print("1213");
			
			if(isSummit == false) {
				num++;
			} else {
				num--;
			}
			
			if(num == top) {
				isSummit = true;
			}
			if(num <= 3) {
				result+="121";
//				System.out.print("121");
				break;
			}
			result+="121"+num;
//			System.out.print("121"+num);
		}
		
		System.out.print(result);
		
    }
}
