import java.util.Scanner;

public class aminusb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();

        int B =sc.nextInt();
        
        int result = (A-B >= 0)? A-B: -1;
        
        System.out.println(result);
	}

}
