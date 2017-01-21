package String;

/**
 * Created by shubham.goyal on 1/17/17.
 */
public class LongestPalindromicSubstring5 {

    int result, startIndex;

    public String longestPalindromeSubstring(String s) {

        int length = s.length();
        if(length < 2) {
            return s;
        }

        for(int i = 0; i < length - 1; i++) {
            checkMaxPalindrome(s, i , i); // to check a palindrome of odd length
            checkMaxPalindrome(s, i , i + 1); // to check a palindrome of even length

        }

        return s.substring(startIndex, startIndex + result);
    }


    public void checkMaxPalindrome (String s, int right, int left) {


        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if(result < right - left - 1) {
            startIndex = left + 1;
            result = right - left - 1;
        }
    }
}
