//Leetcode question - 509
public class D2Q1Fibonacci {
    public int fib(int n) {
        if(n < 2){
            return n;
        }
       
    return fib(n - 1) + fib(n - 2);

    }
}
