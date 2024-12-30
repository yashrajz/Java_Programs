import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check if it's Palindrome or not: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;
        while(temp > 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if(num == rev){
            System.out.println( num + " is a Palindrome number.");
        }
        else{
            System.out.println(num + " is NOT a palindrome number.");
        }

        sc.close();
    }
}
