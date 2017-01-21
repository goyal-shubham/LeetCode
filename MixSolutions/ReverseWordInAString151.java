package MixSolutions;

/**
 * Created by shubhamgoyal on 4/20/16.
 */
public class ReverseWordInAString151 {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        if(s.length() == 0)
        {
            return sb.toString();
        }
        String[] s1 = s.split(" ");

        for(int i = s1.length - 1; i >= 0 ; i--)
        {
            System.out.println(s1[i]);
            sb.append(s1[i] + " ");
        }
        sb.append(s1[0]);
        return sb.toString().trim();
    }

    public static void main(String[] args) {

    }
}
