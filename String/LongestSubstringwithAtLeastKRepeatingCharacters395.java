package String;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by shubham.goyal on 1/20/17.
 */
public class LongestSubstringwithAtLeastKRepeatingCharacters395 {

    public static int longestSubstring(String s, int k) {
        if(s == null || s.length() == 0 || k == 0) {
            return s.length();
        }

        char[] charCount = new char[26];
        for(int i = 0 ; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }

        List<Integer> positionToSplitOn = new LinkedList<>();
        for(int i = 0 ; i < s.length(); i++) {
            if(charCount[s.charAt(i) - 'a'] < k) {
                positionToSplitOn.add(i);
            }
        }

        if(positionToSplitOn.size() == 0) {
            return s.length();
        }

        positionToSplitOn.add(0, -1);
        positionToSplitOn.add(s.length());
        int result = 0;
        for(int i = 1; i < positionToSplitOn.size(); i++) {
            int start = positionToSplitOn.get(i - 1) + 1;
            int end = positionToSplitOn.get(i);
            int nextSubstrinLength = longestSubstring(s.substring(start,end), k);
            result = Math.max(result, nextSubstrinLength);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("aabbb", 3));
    }
}
