import java.util.Scanner;

public class str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str =sc.nextLine();
		
        check(str);
	}
	
	private static void check(String str) {
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		boolean result = true;
		
		for(int i = 0; i < sb.length(); i++) {
			if(i == sb.length()-i-1) break;
			
			char c = sb.charAt(i);
			char c2 = sb.charAt(sb.length()-i-1);
			
			if(c != c2) {
				result = false;
				break;
			}
			
		}
		
		if(result) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
        
    }
}
