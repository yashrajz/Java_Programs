import java.util.*;

public class RecursionExample {
    static void fun(int n){
        if(n > 0){
            System.out.println(n);
            fun(n - 1);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        fun(n);
        sc.close();
    }
}
