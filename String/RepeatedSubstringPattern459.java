package String;

/**
 * Created by shubham.goyal on 1/26/17.
 */
public class RepeatedSubstringPattern459 {

    public static boolean repeatedSubstringPattern(String str) {

        int length = str.length();

        for(int i = length / 2; i >= 1; i--) {

            if(length % i == 0) {

                int repeatCound = length / i;
                String subString = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < repeatCound; j++) {
                    sb.append(subString);
                }

                if(sb.toString().equals(str)) {
                    return true;
                }

            }

        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abaaab"));
    }
}
