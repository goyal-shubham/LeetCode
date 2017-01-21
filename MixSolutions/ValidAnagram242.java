package MixSolutions;

import java.util.Arrays;

/**
 * Created by shubhamgoyal on 4/4/16.
 * Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.

 Note:
 You may assume the string contains only lowercase alphabets.
 */

public class ValidAnagram242 {

    public boolean isAnagram(String s, String t) {

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        // System.out.println(c1);
        // System.out.println(c2);


        return Arrays.equals(c1, c2);



    }
}
