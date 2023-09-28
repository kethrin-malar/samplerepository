public class MethodExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int sum = addNumbers(a, b);
        System.out.println("The sum is: " + sum);
    }
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}

