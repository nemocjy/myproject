import java.util.Scanner;

public class combinationpascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		int B =sc.nextInt();

//		check(A, B);
		System.out.print(pascalTable(A, B));
	}

	private static int pascalTable(int num1, int num2) {
		int n = num1 + 1;
		int[][] table = new int[n][n];
		table[0][0] = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == j)
					table[i][j] = 1;
				else
					table[i][j] = table[i - 1][j - 1] + table[i - 1][j];
			}
		}

		return table[num1][num2];
	}

//	private static void check(int num1, int num2) {
//
//
//
//		int num = 3;
//		boolean isSummit = false; 
//
//		if(top == 3) {
//			System.out.print("1213121");
//			return;
//		}
//
//		while(true) {
//			System.out.print("1213");
//
//			if(isSummit == false) {
//				num++;
//			} else {
//				num--;
//			}
//
//			if(num == top) {
//				isSummit = true;
//			}
//			if(num <= 3) {
//				System.out.print("121");
//				break;
//			}
//			System.out.print("121"+num);
//		}
//
//	}
}
