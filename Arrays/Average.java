public class Average {
	public static void main(String[] args) {
		int array[] = {10, 10, 10, 10, 10};
		int n = array.length;
		int sum = 0;
		for(int v : array)
			sum += v;
		float average = sum/n;
		
		System.out.println("The Given Array is : ");
		for(int v : array)
			System.out.print(v+" ");
		System.out.println("\nThe Average of Given Array is : "+average);
	}
}
/*
	OUTPUT
	The Given Array is : 
	10 20 30 40 50 60 70 80 90 100 
 	The Average of Given Array is : 55.0

	OUTPUT
	The Given Array is : 
	10 10 10 10 10 
	The Average of Given Array is : 10.0
*/
