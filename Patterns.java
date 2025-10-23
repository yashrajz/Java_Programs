public class Patterns {
    public static void main(String[] args) {
        Pattern5(5);
        System.out.println();
        // Pattern2(5);
    }

    // Pattern 1
    static void Pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    public static void Pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 3
    public static void Pattern3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 4
    public static void Pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 5
    // public static void Pattern5(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    //     for(int i = 1; i <= n; i++){
    //         for(int j = 1; j <= n - i + 1; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }


}
