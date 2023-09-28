public class ReverseString {
   public static void main(String args[]) {
       String str1 = "Kethrin Malar";
       System.out.println("Original string: " + str1);
       int n = str1.length(); // calculates length of String

       String Reverse_String = "";
       char ch;
       for(int i = 0; i < n; i++) {
           ch = str1.charAt(i);
           Reverse_String = ch + Reverse_String;
       }
       System.out.println("Reversed string: " + Reverse_String); 
   }
}
