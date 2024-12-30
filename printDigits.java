import java.util.*;

public class printDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while(n > 0){
            int digit = n % 10;
            System.out.println(digit);
            n/=10;
        }
        sc.close();
    }
}
