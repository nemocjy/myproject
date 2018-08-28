import java.util.HashMap;
import java.util.Scanner;

public class representnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[] array = new int[10]; 
        
        for(int i = 0; i < array.length; i++) {
        	array[i] = sc.nextInt();
        }
        
        check(array);
	}
	
	private static void check(int[] array) {
		
		int result = 0;
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < array.length; i++) {
			if(hashMap.containsKey(array[i])) {
				int value = hashMap.get(array[i]);
				value++;
				hashMap.put(array[i], value);
			} else {
				hashMap.put(array[i], 1);
			}
			result += array[i];
		}
        
        System.out.println(result / 10);
        /////
		for(int i = 0; i < array.length; i++) {
			int index = i;
			for(int j = i; j < array.length; j++) {
				if(array[index] > array[j]) {
					index = j;
				}
			}
			
			int temp = array[i];//swap
			array[i] = array[index];
			array[index] = temp;
		}
		
		/////
        
        int max = 0;
        int rep = 0;
        
		for(int i = 0; i < array.length; i++) {
			if(hashMap.containsKey(array[i]) && max < hashMap.get(array[i])) {
				max = hashMap.get(array[i]);
				rep = array[i];
			}
		}
		
		System.out.println(rep);
    }
}
