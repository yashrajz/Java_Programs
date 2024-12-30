import java.util.*;
public class reverseDigit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to reverse: ");
        int n = sc.nextInt();

        int r = 0;
        while (n > 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n/=10;
        }
        System.out.println("The reverse of " + n + " is " + r );
        sc.close();
    }
}
