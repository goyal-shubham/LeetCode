package Math;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class ExcelSheetColumnTitle168 {

    public String convertToTitle(int n) {

        String result = "";
        while(n != 0) {
            char c= (char) ( 65 + (n - 1) % 26);

            result = c + result;
            n = (n - 1) / 26;
        }

        return result;
    }
}
