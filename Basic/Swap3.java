import java.util.Scanner;
public class Swap3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value for a : ");
		int a = scanner.nextInt();
		System.out.println("Enter the value for b : ");
		int b = scanner.nextInt();
		
		System.out.println("Before swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After swapping a & b : ");
		System.out.println("a = "+a+", b = "+b);
		scanner.close();
	}
}
/*
	OUTPUT
	Enter the value for a : 15
	Enter the value for b : 20
	Before swapping a & b : 
	a = 15, b = 20
	After swapping a & b : 
	a = 20, b = 15
	
	OUTPUT
	Enter the value for a : 15
	Enter the value for b : 10
	Before swapping a & b : 
	a = 15, b = 10
	After swapping a & b : 
	a = 10, b = 15
*/
