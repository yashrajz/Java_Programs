import java.util.Scanner;

public class cuboidProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lenght, breadth, height;
        int totalArea, volume;

        System.out.println("Enter the lenght breadth and height: ");
        lenght = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        totalArea = 2 * (lenght * breadth + breadth * height + height * lenght);
        volume = lenght * breadth * height;

        System.out.println("The total area of cuboid is " + totalArea);
        System.out.println("The volume of cuboid is " + volume);
        
        sc.close();
    }
}
