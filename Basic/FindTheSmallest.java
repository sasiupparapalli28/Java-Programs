import java.util.Scanner;
    public class FindTheSmallest{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter three numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int min = Math.min(a, Math.min(b, c));
            System.out.println("Smest number is: " + min);
        }
}
/*
Enter three numbers:
5
3
6
Smest number is: 3
*/
