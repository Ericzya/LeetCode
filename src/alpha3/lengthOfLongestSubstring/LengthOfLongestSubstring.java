package alpha3.lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.print(lengthOfLongestSubstring("a;lfsj;lajsdjaljfljjjjjjjjjjkjkkkeeeeeeeee"));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] elements = s.toCharArray();
        int result = 0;
        int startPos;
        for (int i = 0; i < elements.length; i++) {
            startPos = i;
            Set<Character> hashSet = new HashSet<>();
            for (int j = i; j < elements.length; j++) {
                if (hashSet.contains(elements[j])) {
                    startPos = j;
                    continue;
                } else {
                    result = Math.max(j - startPos + 1, result);
                    hashSet.add(elements[j]);
                }
            }
        }
        return result;
    }
}
