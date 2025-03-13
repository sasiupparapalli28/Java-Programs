import java.util.*;
class FactRecu{
  public static void main(String arg[]){
    Scanner ob=new Scanner(System.in);
    int N=ob.nextInt();
    System.out.print(fact(N));
  }
  public static int fact(int N){
    if(N==1)
      return 1;
    else
      return N*fact(N-1);
  }
}
/*
  OUTPUT
  5
  120
*/
