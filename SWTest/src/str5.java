import java.util.Scanner;

public class str5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str =sc.nextLine();
		
        check(str);
	}
	
	private static void check(String str) {
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		StringBuffer sb2 = new StringBuffer();
		
		char temp = sb.charAt(0);
		
		int count = 1;
		
		for(int i = 1; i < sb.length(); i++) {
			
			char c = sb.charAt(i);
			
			if(c == temp) {
				count++;
			} else {
				if(count != 1) sb2.append(count);
				sb2.append(temp);
				count = 1;
			}
			
			if(i == sb.length()-1) {
				if(count != 1) sb2.append(count);
				sb2.append(temp);
			}
			
			temp = c;
		}
		
		System.out.println(sb2.toString());
        
    }
}
