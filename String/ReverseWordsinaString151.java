package String;

/**
 * Created by shubham.goyal on 1/17/17.
 */
public class ReverseWordsinaString151 {

    public String reverseWords(String s) {

        if(s.length() == 0) {
            return s;
        }

        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i > 0; i--) {
            sb.append(words[i] + " ");
        }
        sb.append(words[0]);
        return sb.toString();
    }
}
