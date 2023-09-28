public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);
        numbers[3] = 10;
        System.out.println("Modified element at index 3: " + numbers[3]);
        int length = numbers.length;
        System.out.println("Length of the array: " + length);
        System.out.println("Elements in the array:");
        for (int i = 0; i < length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

