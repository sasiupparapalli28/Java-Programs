public class ArmstrongNumberList {
	
	public static void main(String[] args) {
		System.out.println("Armstrong Number from 1 to 1000 :: ");
		
		for(int i=1; i<=1000; i++)
			if(isArmstrongNumber(i))
				System.out.print(i+" ");
	}

	private static boolean isArmstrongNumber(int num){
		int digitsSum = 0;
		int tempNum = num;
		
		while( num > 0 ){
			int digit = num % 10;
			digitsSum += digit * digit * digit;
			num = num / 10;
		}
				
		if(digitsSum == tempNum)
			return true;
		return false;
	}
}
/*
	OUTPUT
	Armstrong Number from 1 to 1000 :: 
	1 153 370 371 407
*/
