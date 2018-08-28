import java.util.Scanner;

public class Rook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[][] array = new int[8][8]; 
        
        for(int i = 0; i < array.length; i++) {
        	for(int j = 0; j < array[0].length; j++) {
        		array[i][j] = sc.nextInt();
        	}
        }
        
        check(array);
	}
	
	private static void check(int[][] array) {
		
		int rook1i = -1;
		int rook1j = -1;
		int rook2i = -1;
		int rook2j = -1;
		
		int kingi = -1;
		int kingj = -1;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				if(array[i][j] == 1) {
					kingi = i;
					kingj = j;
				}
				
				if(array[i][j] == 2) {
					if(rook1i == -1) {
						rook1i = i;
						rook1j = j;
					} else {
						rook2i = i;
						rook2j = j;
					}
				}
			}
		}
		
		if(rook1i == -1 && rook2i == -1) {
			System.out.print(0);
			return;
		}
		
		if(rook1i == kingi) {
			int start = 0;
			int end = 0;
			if(rook1j > kingj) {
				start = kingj;
				end = rook1j;
			} else {
				start = rook1j;
				end = kingj;
			}
			int count = 0;
			
			for(int i = start; i < end; i++) {
				if(array[rook1i][i] == 3) {
					count++;
				}
			}
			
			if(count == 0) {
				System.out.print(1);
				return;
			}
		}
		
		if(rook1j == kingj) {
			int start = 0;
			int end = 0;
			if(rook1i > kingi) {
				start = kingi;
				end = rook1i;
			} else {
				start = rook1i;
				end = kingi;
			}
			int count = 0;
			
			for(int i = start; i < end; i++) {
				if(array[i][rook1j] == 3) {
					count++;
				}
			}
			
			if(count == 0) {
				System.out.print(1);
				return;
			}
		}
		
		if(rook2i == -1) {
			System.out.print(0);
			return;
		}
		
		if(rook2i == kingi) {
			int start = 0;
			int end = 0;
			if(rook2j > kingj) {
				start = kingj;
				end = rook2j;
			} else {
				start = rook2j;
				end = kingj;
			}
			int count = 0;
			
			for(int i = start; i < end; i++) {
				if(array[rook2i][i] == 3) {
					count++;
				}
			}
			
			if(count == 0) {
				System.out.print(1);
				return;
			}
		}
		
		if(rook2j == kingj) {
			int start = 0;
			int end = 0;
			if(rook2i > kingi) {
				start = kingi;
				end = rook2i;
			} else {
				start = rook2i;
				end = kingi;
			}
			int count = 0;
			
			for(int i = start; i < end; i++) {
				if(array[i][rook2j] == 3) {
					count++;
				}
			}
			
			if(count == 0) {
				System.out.print(1);
				return;
			}
		}
		
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
		System.out.print(0);
		
    }
}
