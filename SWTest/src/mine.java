import java.util.Scanner;

public class mine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		int B =sc.nextInt();
		int C =sc.nextInt();
		int D =sc.nextInt();
		
        int[][] array = new int[A][B]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array, C-1, D-1);
	}
	
	private static boolean mineCheck(int[][] array, int x, int y) {
		if(x < 0 || x >= array.length || y < 0 || y >= array.length) {
			return false;
		}
		
		if(array[x][y] == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	private static void check(int[][] array, int x, int y) {
		
		if(array[x][y] == 1) {
			System.out.print("game over");
			return;
		}
		
		int count = 0;
		
		if(mineCheck(array, x-1, y-1)) count++;
		if(mineCheck(array, x-1, y)) count++;
		if(mineCheck(array, x-1, y+1)) count++;
		if(mineCheck(array, x, y-1)) count++;
		if(mineCheck(array, x, y+1)) count++;
		if(mineCheck(array, x+1, y-1)) count++;
		if(mineCheck(array, x+1, y)) count++;
		if(mineCheck(array, x+1, y+1)) count++;
		
		System.out.print(count);
		
//		if(y != 0) {
//			if(x != 0) {
//				if(array[x-1][y-1] == 1) {
//					count++;
//				}
//				if(array[x][y-1] == 1) {
//					count++;
//				}
//				if(array[x+1][y-1] == 1) {
//					count++;
//				}
//			} else {
//				
//			}
//		}
//		
////		for(int i = 0; i < array.length; i++) {
////			for(int j = 0; j < array[0].length; j++) {
////				
////			}
////		}
//		
//		
//		
//		int rook1i = -1;
//		int rook1j = -1;
//		int rook2i = -1;
//		int rook2j = -1;
//		
//		int kingi = -1;
//		int kingj = -1;
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[0].length; j++) {
//				if(array[i][j] == 1) {
//					kingi = i;
//					kingj = j;
//				}
//				
//				if(array[i][j] == 2) {
//					if(rook1i == -1) {
//						rook1i = i;
//						rook1j = j;
//					} else {
//						rook2i = i;
//						rook2j = j;
//					}
//				}
//			}
//		}
//		
//		if(rook1i == -1 && rook2i == -1) {
//			System.out.print(0);
//			return;
//		}
//		
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[0].length; j++) {
//				if(kingi == i && kingi == rook1i && array[i][j] == 3) {
//					if((kingj > rook1j && (j > kingj || j < rook1j)) || 
//							(kingj < rook1j && (j < kingj || j >rook1j))) {
//						System.out.print(1);
//						return;
//					}
//				} else if(kingj == j && kingj == rook1j && array[i][j] == 3) {
//					if((kingi > rook1i && (i > kingi || i < rook1i)) || 
//							(kingi < rook1i && (i < kingi || i >rook1i))) {
//						System.out.print(1);
//						return;
//					}
//				}
//				
//				if(rook2i == -1) continue;
//				
//				if(rook2i != -1 && kingi == i && kingi == rook2i && array[i][j] == 3) {
//					if((kingj > rook2j && (j > kingj || j < rook2j)) || 
//							(kingj < rook2j && (j < kingj || j >rook2j))) {
//						System.out.print(1);
//						return;
//					}
//				} else if(rook2j != -1 && kingj == j && kingj == rook2j && array[i][j] == 3) {
//					if((kingi > rook2i && (i > kingi || i < rook2i)) || 
//							(kingi < rook2i && (i < kingi || i >rook2i))) {
//						System.out.print(1);
//						return;
//					}
//				}
//			}
//		}
//		
//		System.out.print(0);
		
    }
}
