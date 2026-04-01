import java.util.HashSet;
public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Length : " + maxLength);
    }
}
