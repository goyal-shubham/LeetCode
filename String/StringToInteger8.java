package String;

/**
 * Created by shubham.goyal on 1/17/17.
 */
public class StringToInteger8 {

    public int myAtoi(String str) {

        int result = 0, sign = 1;

        int index = 0;

        if( str.length() == 0) {
            return result;
        }
        // 1. remove whitespaces
        while(str.charAt(index) == ' ' && index < str.length()){
            index++;
        }

        // 2. get sign value
        if(str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        // 3. Convert to Number
        while(index < str.length()) {
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) {
                break;
            }

            if(Integer.MAX_VALUE / 10 < result || Integer.MAX_VALUE / 10 == result && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = (result * 10 ) + digit;
            index++;
        }

        return result * sign;
    }
}
