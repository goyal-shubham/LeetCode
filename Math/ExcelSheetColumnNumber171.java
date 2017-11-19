package Math;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String s) {

        char[] input = s.toCharArray();
        int result = 0;
        int multiplier = 26;
        for(char c : input) {
            result = (result * multiplier) +  (c - 64);
        }

        return result;
    }
}
