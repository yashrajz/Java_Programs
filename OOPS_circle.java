import java.util.*;

class Circle {
    double radius;

    double area(){
        return Math.PI * radius * radius;
    }
    double perimeter(){
        return 2 * Math.PI * radius;
    }
    double circumference(){
        return perimeter();
    }
}

public class OOPS_circle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        c1.radius = sc.nextDouble();
    
        System.out.println("The area of circle is " +  c1.area());
        System.out.println("The perimeter of circle is " +  c1.perimeter());
        System.out.println("The circumference of circle is " +  c1.circumference());

        sc.close();

    }
}
