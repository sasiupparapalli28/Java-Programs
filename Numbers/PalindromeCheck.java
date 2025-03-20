public class PalindromeCheck {
	public static void main(String[] args) {
		int N = 12345;
		String reverse = "";
		
		int temp = N;
		while(temp > 0){
			int d = temp % 10;
			temp = temp/10;
			reverse =  reverse + d; 
		}
		int reverseN = Integer.parseInt(reverse);
		if(N == reverseN)
			System.out.println(N+" is a Palindrome Number");
		else
			System.out.println(N+" is NOT a Palindrome Number");		
	}
}
/*
	OUTPUT
	16461 is a Palindrome Number
	
	OUTPUT
	12321 is a Palindrome Number

	OUTPTU
	12345 is NOT a Palindrome Number
*/
