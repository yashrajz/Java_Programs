import java.util.*;

public class sumOfNumInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++){    //for loop
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int x : arr ){      //for each loop
            sum = sum + x;
        }

        System.out.println("The sum of elements are "+ sum);

        sc.close();

    }
}