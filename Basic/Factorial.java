import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		int N = ob.nextInt();
		int result =1;
		for(int i=1; i<=N; i++)
			result = result * i;
		System.out.print(result);
	}
}
/*
	OUTPUT
	5
	120
	
	OUTPUT
	10
	3628800
*/
