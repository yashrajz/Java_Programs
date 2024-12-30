import java.util.*;
public class armstrongNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp/=10;
        }
        if(sum == num){
            System.out.println(num + " is an Armstrong number.");
        }
        else{
            System.out.println( num + " is not an Armstrong number.");
        }
        sc.close();
    }
}
