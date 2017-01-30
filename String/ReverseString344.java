package String;

/**
 * Created by shubham.goyal on 1/21/17.
 */
public class ReverseString344 {

    public String reverseString(String s) {

        char[] data = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            char word = data[start];
            data[start] = data[end];
            data[end] = word;
            start++;
            end--;
        }

        return new String(data);

    }
}
