import java.util.Scanner;

public class pfactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A =sc.nextInt();
		
        check(A);
	}
	
	private static void check(int num) {

		int div=2;//나누기에 사용할 변수



		while(true){

			if(num%div==0){

				System.out.println(div);

				num=num/div;

				if(num==1)break;

			}else{

				div++;

			}

		}



		
    }
}
