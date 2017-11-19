package String;

/**
 * Created by shubham.goyal on 2/1/17.
 */
public class SimpleRegexParser {

    public boolean isMatch(String s, String p) {


        int j = 0, i = 0;

        char previousChar = ' ';
        for(i = 0; i < p.length() && j < s.length(); i++) {

            char currentChar = p.charAt(i);
            if(currentChar == '.') {
                previousChar = s.charAt(j++);
            }
            else if(currentChar == '*') {

                while(j < s.length() && s.charAt(j) == previousChar){
                    j++;
                }
            }
            else {
                if(currentChar != s.charAt(j++)){
                    return false;
                }
                previousChar = s.charAt(j);
            }
        }

        if(i == p.length() && j == s.length()){
            return true;
        }
        return false;

    }

}
