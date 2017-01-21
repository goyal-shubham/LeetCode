package String;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by shubham.goyal on 1/17/17.
 */
public class SubstringwithConcatenationofAllWords30 {

    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new LinkedList<>();

        if(s == null || words == null || words.length == 0 ) {
            return result;
        }

        int wordLength = words[0].length();
        HashMap<String, Integer> myMap = new HashMap<>();
        for(String word : words) {

            myMap.put(word, myMap.containsKey(word) ? myMap.get(word) + 1 : 1);

        }

        for(int i = 0; i <= s.length() - wordLength * words.length; i++) {
            HashMap<String, Integer> copyMap = new HashMap<>(myMap);

            for(int j = 0; j < words.length; j++) {
                int start = i + (j * wordLength);
                String currentWord = s.substring(start , start + wordLength);
                if(copyMap.containsKey(currentWord)) {
                    int count = copyMap.get(currentWord);
                    if( count == 1) {
                        copyMap.remove(currentWord);
                    }
                    else {
                        copyMap.put(currentWord, count - 1);
                    }

                    if( copyMap.isEmpty()) {
                        result.add(i);
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }

        return result;


    }
}
