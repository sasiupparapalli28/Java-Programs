import java.util.Scanner;
public class Swap2{
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		int a = ob.nextInt();
		int b = ob.nextInt();
		System.out.println("Before swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
	}
}
/*
	OUTPUT
  15
  20
	Before swapping a & b : 
	a = 15, b = 20
	After swapping a & b : 
	a = 20, b = 15
*/
