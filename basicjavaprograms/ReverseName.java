public class ReverseName {
    public static void main(String[] args) {
        String name = "KethrinMalar";
        System.out.println("Original name: " + name);
        char[] charArray = name.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String reversedName = new String(charArray);
        System.out.println("Reversed name: " + reversedName);
    }
}

