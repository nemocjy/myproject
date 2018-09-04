import java.util.Scanner;

public class circlequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		
        int[] array = new int[A]; 
//        A--;
        int B = sc.nextInt();
        
        int front = 0;
        int rear = 0;
        for(int i = 0; i < B; i++) {
        	int op = sc.nextInt();
        	switch(op)
        	{
        	case 1:
        		if((rear+1) % array.length != front)
        		{
        			rear = (rear+1) % array.length;
        			array[rear] = sc.nextInt();
//        			rear++;
        		}
        		else
        		{
        			sc.nextInt();
        			System.out.println("Overflow");
        		}
        		break;
        	case 2:
        		if(front == rear)
        		{
        			System.out.println("Underflow");
        		}
        		else
        		{
//        			System.out.println(array[index]);
        			front = (front+1) % array.length;
//        			front++;
//        			index--;
        		}
        		break;
        	case 3:
        		if(front != rear)
        		{
//        			front++;
        			System.out.println(array[(front+1) % array.length]);
//        			front++;
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
