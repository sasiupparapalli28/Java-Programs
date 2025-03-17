import java.util.*;
public class ReverseTheNumber {
	public static void main(String[] args) {
	Scanner ob = new Scanner(System.in);
    int N=ob.nextInt();
    int sum=0;
    while(N!=0){
      int r=N%10;
      sum=(sum*10)+r;
      N=N/10;
    }
    System.out.print(sum);
  }
}

/*OUTPUT
254
452
*/
