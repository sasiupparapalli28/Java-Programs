import java.util.Scanner;
public class FactorsOfANumber {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int num = ob.nextInt();
		printFactors(num);
	}
	public static void printFactors(int num){
		for(int i=1;i<=num/2;i++){
			if(num % i == 0)
				System.out.print(i+", ");
		}
		System.out.print(num);
	}
}
/*
	OUTPUT
	40
	1, 2, 4, 5, 8, 10, 20, 40
	
	OUTPUT
	75
	1, 3, 5, 15, 25, 75
*/
