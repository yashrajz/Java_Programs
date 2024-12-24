import java.util.Scanner;

public class AreaQuestion {
    public static void main(String[] args) {
        
        double area, base, height;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of Triangle: ");
        base = sc.nextDouble();
        System.out.println("Enter the height of Triangle: ");
        height = sc.nextDouble();

        area = 0.5 * base * height;
        System.out.println("The area of Triangle is " + area);
        sc.close();
    }
}
