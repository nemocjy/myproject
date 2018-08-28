import java.util.Scanner;

public class str2 {

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
		
		
		for(int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if(Character.isAlphabetic(c)) {
				if(Character.isUpperCase(c)) {
					c = Character.toLowerCase(c);
				} else {
					c = Character.toUpperCase(c);
				}
			}
			
			sb2.append(c);
		}
		
		
        System.out.println(sb2.toString());
    }
}
