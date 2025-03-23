public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer :: ");
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		if(isPerfectNumber(num))
			System.out.println("Given number : "+num+" is a Perfect Number");
		else
			System.out.println("Given number : "+num+" is NOT a Perfect Number");
		scanner.close();
	}

	private static boolean isPerfectNumber(int num) {
		int tempNum = num;
		int divisorSum = 1;
		for (int i = 2; i <= num / 2; i++)
			if (num % i == 0)
				divisorSum += i;

		if(tempNum == divisorSum)
			return true;
		return false;
	}
}
/*
	OUTPUT
	
	Enter any positive integer :: 6
	Given number : 6 is a Perfect Number
	
	Enter any positive integer :: 28
	Given number : 28 is a Perfect Number
	
	Enter any positive integer :: 100
	Given number : 100 is NOT a Perfect Number
	
*/
