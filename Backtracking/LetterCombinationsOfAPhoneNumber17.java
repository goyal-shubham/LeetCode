package Backtracking;

import java.util.*;

/**
 * Created by shubham.goyal on 2/22/17.
 */
public class LetterCombinationsOfAPhoneNumber17 {
    List<String> result;
    HashMap<String, String> myMap;

    public List<String> letterCombinations(String digits) {

        result = new LinkedList<String>();
        myMap = new HashMap<>();
        myMap.put("2","abc");
        myMap.put("3", "def");
        myMap.put("4", "ghi");
        myMap.put("5", "jkl");
        myMap.put("6", "mno");
        myMap.put("7", "pqrs");
        myMap.put("8", "tuv");
        myMap.put("9", "wxyz");
        char[] input = digits.toCharArray();
        letterCombinations(input, 0, "");
        return result;
    }

    public void letterCombinations(char[] input, int start, String current) {
        if(current.length() == input.length){
            result.add(current);
            return;
        }

        String c = input[start] + "";
        if(!myMap.containsKey(c)) {
            return;
        }
        String s = myMap.get(c);
        for(int i = 0; i < s.length(); i++) {
            letterCombinations(input, start + 1, current + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber17 obj = new LetterCombinationsOfAPhoneNumber17();
        obj.letterCombinations("234");
    }

}
