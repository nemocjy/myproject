import java.util.Scanner;

public class cardgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		int A =sc.nextInt();
		
        int[] array1 = new int[10];
        int[] array2 = new int[10]; 
        
        for(int i = 0; i < array1.length; i++) {
        	array1[i] = sc.nextInt();
        }
        
        for(int i = 0; i < array2.length; i++) {
        	array2[i] = sc.nextInt();
        }
		
        check(array1, array2);
	}
	
	private static void check(int[] array1, int[] array2) {
		int aWin = 0;
		int bWin = 0;
		
		for(int i = 0; i < 10; i++) {
			if(array1[i] > array2[i]) {
				aWin++;
			} else if(array1[i] < array2[i]) {
				bWin++;
			}
		}
		
		if(aWin > bWin) {
			System.out.println("A");
		} else if (aWin < bWin) {
			System.out.println("B");
		} else {
			System.out.println("D");
		}
    }
}
