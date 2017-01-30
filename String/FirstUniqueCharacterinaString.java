package String;

/**
 * Created by shubham.goyal on 1/23/17.
 */
public class FirstUniqueCharacterinaString {

    public int firstUniqChar(String s) {


        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
