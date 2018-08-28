import java.util.Scanner;

public class str3 {

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
		
		
		for(int i = sb.length()-1; i >= 0; i--) {
			char c = sb.charAt(i);
			sb2.append(c);
		}
		
		
        System.out.println(sb2.toString());
    }
}
