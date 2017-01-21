package String;

import java.util.HashMap;

/**
 * Created by shubham.goyal on 1/17/17.
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 */
public class LongestSubstringWithoutRepeatingCharacters3 {

    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0) {
            return 0;
        }

        int result = 0;
        HashMap<Character, Integer> myMap = new HashMap<>();
        for(int i = 0, j = 0; i < s.length(); i++) {

            if(myMap.containsKey(s.charAt(i))) {
                j = Math.max(j , myMap.get(s.charAt(i)) + 1);
            }

            myMap.put(s.charAt(i), i);
            result = Math.max(result, i - j + 1);
        }

        return result;
    }

}
