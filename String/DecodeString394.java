package String;

import java.util.Stack;

/**
 * Created by shubham.goyal on 1/17/17.
 */
public class DecodeString394 {

    public String decodeString(String s) {

        String result = "";
        Stack<String> myStack = new Stack<>();

        int index = 0;
        String count = "";
        while(index < s.length()) {

            char c = s.charAt(index);
            if(c >= '0' && c <= '9'){
                count += c;
            }
            else if(c == '[') {
                myStack.push(count);
                count = "";
            }
            else if(c == ']') {

            }
            else {
                result += c;
            }
            index++;
        }

        return result;
    }

}
