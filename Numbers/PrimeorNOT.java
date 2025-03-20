import  java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
       if(prime(n)==2){
           System.out.print("Prime");
       }
       else{
           System.out.print("Not Prime");
       }
    }
    public static int prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
           if(n%i==0){
               c++;
           }
        }
        return c;
    }
}

/*
  OUTPUT
  7
  Prime
*/
