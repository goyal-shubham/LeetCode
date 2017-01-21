package MixSolutions;

/**
 * Created by shubhamgoyal on 3/30/16.
 */
public class MultiplyStrings43
{

    public  static String multiply(String num1, String num2)
    {
        char[] str1 = num1.toCharArray();
        char[] str2 = num2.toCharArray();
        int l1 = num1.length();
        int l2 = num2.length();
        int carry = 0;
        int[] result = new int[l1 + l2];
        if (str1[0] == '0' || str2[0] == '0')
        {
            return "0";
        }


        for(int i = l1 - 1; i >= 0 ; i--)
        {
            int val1 = num1.charAt(i)- '0';
            int res = 0 ;
            for(int j = l2 - 1; j >= 0 ; j--)
            {
                int val2 = num2.charAt(j)- '0';
                int output = (val1 * val2) ;
                // System.out.println(output);
                result[i + j] += output / 10;//carry
                result[i + j + 1] += output % 10;//current digit
            }
        }

        for( int i = result.length - 1; i >= 1 ; i--)
        {
            //System.out.println(result[i]);
            result[i - 1] += result[i] / 10;
            result[i] = result[i] % 10 ;

        }

        StringBuilder result1 = new StringBuilder();

        if(result[0] != 0)
        {
            result1.append(result[0]);
        }
        for( int i = 1; i < result.length ; i++)
        {
            result1.append(result[i]);
        }

        return result1.toString();
    }


}
