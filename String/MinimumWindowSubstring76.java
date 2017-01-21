package String;

import java.util.HashMap;

/**
 * Created by shubham.goyal on 1/17/17.
 */
public class MinimumWindowSubstring76 {

    public String minWindow(String s, String t) {

        String result = "";
        if(s.length() < t.length()) {
            return result;
        }

        HashMap<Character, Integer> targetMap = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {

            Character c = t.charAt(i);
            if(targetMap.containsKey(c)) {
                targetMap.put(c , targetMap.get(c) + 1);
            }
            else {
                targetMap.put(c, 1);
            }
        }

        HashMap<Character, Integer> sourceMap = new HashMap<>();
        int left = 0;
        int minLen = s.length() + 1;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if(targetMap.containsKey(c)) {

                if(sourceMap.containsKey(c)) {

                    if(sourceMap.get(c) < targetMap.get(c)) {
                        count++;
                    }
                    sourceMap.put(c, sourceMap.get(c) + 1);
                }
                else {
                    sourceMap.put(c , 1);
                    count++;
                }
            }

            if(count == t.length()) {
                char firstChar = s.charAt(left);
                while( !sourceMap.containsKey(firstChar) || sourceMap.get(firstChar) > targetMap.get(firstChar)) {

                    if(sourceMap.containsKey(firstChar) && sourceMap.get(firstChar) > targetMap.get(firstChar)) {
                        sourceMap.put(firstChar, sourceMap.get(firstChar) - 1);
                    }
                    left++;
                    firstChar = s.charAt(left);

                    if (i - left + 1 < minLen) {
                        result = s.substring(left, i + 1);
                        minLen = i - left + 1;
                    }
                }
            }


        }
        return result;
    }
}
