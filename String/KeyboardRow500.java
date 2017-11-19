package String;

import java.util.*;

/**
 * Created by shubham.goyal on 2/18/17.
 */
public class KeyboardRow500 {

    public String[] findWords(String[] words) {
        String[] keyBoardRows = new String[] {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < keyBoardRows.length; i++){
            for(char c: keyBoardRows[i].toCharArray()){
                map.put(c, i);
            }
        }


        List<String> result = new LinkedList<>();


        for( String word : words) {
            int currentRow = -1;
            String temp = word.toLowerCase();
            boolean matchFound = true;
            for(char c : temp.toCharArray()){
                if(currentRow == -1) {
                    currentRow = map.get(c);
                }
                else if(currentRow != map.get(c)){
                    matchFound = false;
                    break;
                }
            }
            if(matchFound) {
                result.add(word);
            }
        }

        String[] answer = new String[result.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        KeyboardRow500 obj = new KeyboardRow500();
        String[] result = obj.findWords(new String[]{"Dad", "hello", "qwerty", "ALASKA"});
        System.out.println(result);
    }
}
