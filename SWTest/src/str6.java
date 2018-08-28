import java.util.Scanner;

public class str6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str =sc.nextLine();
		String str2 =sc.nextLine();
		
        check(str, str2);
	}
	
	private static void check(String str, String str2) {
		
		if(str.contains(str2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
    }
}
