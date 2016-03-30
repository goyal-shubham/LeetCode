/**
 * Created by shubhamgoyal on 3/30/16.
 */
public class PlusOne66 {

    public int[] plusOne(int[] digits) {

        return addOne(digits, digits.length);
    }


    public int[] addOne(int[] digits, int n)
    {
        if( n == 0)
        {
            int size = digits.length;
            int[] result = new int[size + 1];
            result[0] = 1;
            return result;
        }

        if(digits[n - 1] < 9)
        {
            digits[n - 1]++ ;
            return digits;
        }
        else
        {
            digits[n - 1] = 0;
            return addOne(digits, n - 1);
        }

    }
}
