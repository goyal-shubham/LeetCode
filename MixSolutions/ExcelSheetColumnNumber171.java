package MixSolutions;

/**
 * Created by shubhamgoyal on 4/4/16.
 */
public class ExcelSheetColumnNumber171 {

    public int titleToNumber(String s) {

        char[] c1 = s.toCharArray();
        int result = 0;
        int base = 0;
        for(int i = 0; i < c1.length; i++)
        {
            result = (c1[i] - 'A' + 1) + base ;
//            System.out.println(result);
            base = result * 26;
        }

        return result;
    }

    public String convertToTitle(int n) {

        StringBuilder s1 = new StringBuilder();
        while(n > 0)
        {
            int d = ((n-1) % 26);
            s1.append((char) (65 + d ));
            n = (n - d - 1) / 26;
        }

        return s1.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber171 e = new ExcelSheetColumnNumber171();
        System.out.println(e.titleToNumber("BZ"));
        System.out.println(e.convertToTitle(53));
    }
}
