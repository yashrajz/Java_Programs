import java.util.Scanner;

public class bitwiseOperators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number to swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before Swapping, a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping, a = " + a + " b = " + b);
        sc.close();

    }
}
