import java.util.Scanner;

public class str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str =sc.nextLine();
		
        check(str);
	}
	
	private static void check(String str) {
		str = str.replaceAll(" ", "");
        System.out.println(str);
    }
}
