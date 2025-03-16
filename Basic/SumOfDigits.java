import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.println("Please enter any number :: ");
		int N = ob.nextInt();
		int temp = N;
		int sum = 0;
		while( N > 0){
			int r = N %10;
			sum += r;
			N = N /10;
		}
		System.out.println(sum);
	}
}

/*
	OUTPUT
	1986
  24

*/
