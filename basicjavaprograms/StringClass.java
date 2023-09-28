public class StringClass {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        System.out.println("str1: " + str1);
        String str2 = new String("Java Programming");
        System.out.println("str2: " + str2);
        String concatStr = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatStr);
        int length = str1.length();
        System.out.println("Length of str1: " + length);
        char firstChar = str2.charAt(0);
        System.out.println("First character of str2: " + firstChar);
        String substr = str2.substring(7);
        System.out.println("Substring of str1: " + substr);
        String lowerCase = str2.toLowerCase();
        String upperCase = str2.toUpperCase();
        System.out.println("Lowercase str2: " + lowerCase);
        System.out.println("Uppercase str2: " + upperCase);
    }
}

