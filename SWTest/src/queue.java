import java.util.Scanner;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		
        int[] array = new int[A]; 
        A--;
        int B = sc.nextInt();
        
        int front = -1;
        int rear = -1;
        for(int i = 0; i < B; i++) {
        	int op = sc.nextInt();
        	switch(op)
        	{
        	case 1:
        		if(rear < A)
        		{
        			rear++;
        			array[rear] = sc.nextInt();
        		}
        		else
        		{
        			sc.nextInt();
        			System.out.println("Overflow");
        		}
        		break;
        	case 2:
        		if(front < 0)
        		{
        			System.out.println("Underflow");
        		}
        		else
        		{
//        			System.out.println(array[index]);
        			front++;
//        			index--;
        		}
        		break;
        	case 3:
        		if(front != rear)
        		{
        			System.out.println(array[front]);
        			front++;
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
