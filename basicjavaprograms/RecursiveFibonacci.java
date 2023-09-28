public class RecursiveFibonacci {
    
    public static void main(String[] args) {
        int count = 10;
        System.out.print("Fibonacci Series:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
