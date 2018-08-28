import java.util.Scanner;

public class str7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
		String[] array = new String[A];
		
		for(int i = 0; i < array.length; i++) {
			String str = sc.next();
			array[i] = str;
		}
		
        check(array);
	}
	
	private static void check(String[] array) {
			
		for(int i = 0; i < array.length; i++) {
			int index = i;
			for(int j = i; j < array.length; j++) {
				if(array[index].compareTo(array[j]) > 0) {
					index = j;
				}
			}
			
			String temp = array[i];//swap
			array[i] = array[index];
			array[index] = temp;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
		
		
    }
}
