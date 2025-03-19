public class LCM {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		int lcm = (a > b) ? a : b;
		
		while(true){
			if(lcm % a == 0 && lcm % b == 0){
				System.out.println("LCM of "+a+" & "+b+" is "+lcm);
				break;
			}
			lcm++;
		}
	}
}
/*
	OUTPUT
	LCM of 12 & 15 is 60
	LCM of 10 & 6 is 30
	LCM of 10 & 5 is 10
	LCM of 5 & 7 is 35
*/
