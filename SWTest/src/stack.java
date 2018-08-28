import java.util.Scanner;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		
        int[] array = new int[A]; 
        A--;
        int B = sc.nextInt();
        
        int index = -1;
        for(int i = 0; i < B; i++) {
        	int op = sc.nextInt();
        	switch(op)
        	{
        	case 1:
        		if(index < A)
        		{
        			index++;
        			array[index] = sc.nextInt();
        		}
        		else
        		{
        			sc.nextInt();
        			System.out.println("Overflow");
        		}
        		break;
        	case 2:
        		if(index < 0)
        		{
        			System.out.println("Underflow");
        		}
        		else
        		{
//        			System.out.println(array[index]);
        			index--;
        		}
        		break;
        	case 3:
        		if(index >= 0)
        		{
        			System.out.println(array[index]);
        		}
        		else
        		{
        			System.out.println("NULL");
        		}
        		break;
        	}
        }
	}
	
}
