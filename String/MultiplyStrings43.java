package String;

/**
 * Created by shubham.goyal on 1/17/17.
 */
public class MultiplyStrings43 {

    public String multiply(String num1, String num2) {

        int length1 = num1.length();
        int length2 = num2.length();

        int[] result = new int[length1 + length2];


        for (int i = length1 - 1; i >= 0; i--) {
            for(int j = length2 - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                result[i + j + 1] += digit1 * digit2;
            }
        }

        int carry = 0;

        for(int i = result.length - 1; i >= 0; i--) {
            int number = result[i] + carry;
            carry = number / 10;
            result[i] = number % 10;
        }

        StringBuilder sb = new StringBuilder();

        for(int numbers : result) {

            sb.append(numbers);
        }

        while(sb.length() != 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
