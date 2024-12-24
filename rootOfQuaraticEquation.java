import java.util.Scanner;
public class rootOfQuaraticEquation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double r1, r2;
        
        System.out.println("Enter the value of a, b and c: ");
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
        r2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2 * a);

        System.out.println("The roots of quadratic equations are " + r1 + " " + r2);
        sc.close();
    }
}
