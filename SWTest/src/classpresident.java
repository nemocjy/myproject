import java.util.Scanner;

public class classpresident {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        
        int[][] array = new int[A][5]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        	
        }
        
        check(array, A);
	}
	
	private static void check(int[][] array, int num) {
		
		int max = -1;
		int stu = 0;
		
		for(int i = 0; i < num; i++) {
			int count = 0;
			for(int j = 0; j < num; j++) {
				for(int k = 0; k < 5; k++) {
					if(array[i][k] == array[j][k]) {
						count++;
						break;
					}

				}
			}
			if(count > max) {
				max = count;
				stu = i;
			}
		}
		
		System.out.println(stu+1);
		
    }
}
