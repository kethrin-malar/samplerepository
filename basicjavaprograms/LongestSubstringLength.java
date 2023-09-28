public class LongestSubstringLength {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] Value = new boolean[256];
            int length = 0;

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if (Value[c]) {
                    break;
                }

                Value[c] = true;
                length++;
            }

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
} 
