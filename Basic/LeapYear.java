import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int year = ob.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.println("LEAP YEAR!");
		else
			System.out.println("not leap year.");
	}
}
/*
	INPUT
	2020
	OUTPUT
  LEAP YEAR!
	
	INPUT
	2100
	OUTPUT
	not leap year. 

*/
