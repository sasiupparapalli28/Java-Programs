import java.util.*;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int num = ob.nextInt();
		if( num % 2 == 0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");
	}
}
/*
	OUTPUT
  22
	EVEN
 
	OUTPUT
  25
	ODD
*/
