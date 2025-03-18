public class GCD {
	public static void main(String[] args) {
		int a = 10;
		int b = 55;
		if(a < b){
			int temp = a;
			a = b;
			b = temp;
		}
		
		while(b > 0){
			int temp = b;
			//as b is small get reminder of a and b
			b = a%b;
			a = temp;
		}
		System.out.println("GCD is 10 & 55 : "+a);
	}
}
/*
	OUTPUT
	GCD is 10 & 55 : 5
	GCD is 143 & 26 : 13
	GCD is 7 & 29 : 1
	GCD is 45 & 75 : 15
*/
