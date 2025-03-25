import java.util.Scanner;
public class LargestDivisor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int n = scanner.nextInt();
		int output = largestDivisor(n);
		System.out.println("Largest Divisor is : "+output);
		scanner.close();
	}
	
	public static int largestDivisor(int n){
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i == 0)
				return n/i;
		return 1;
	}
}

/*
Enter a number :: 100
Largest Divisor is : 50

Enter a number :: 23
Largest Divisor is : 1

Enter a number :: 25
Largest Divisor is : 5
*/
