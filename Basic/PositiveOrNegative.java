import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();
		if(n > 0 )
			System.out.println("Positive");
		else if( n < 0 )
			System.out.println("Negative");
		else
			System.out.println("Zero is neither Positive nor Negative.");
  }
}
/*
	OUTPUT
	155
  Positive

	OUTPUT
	-77
	Negative

	OUTPUT
	0
	Zero is neither Positive nor Negative.
*/
