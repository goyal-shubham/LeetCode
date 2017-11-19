package BitManipulation;

/**
 * Created by shubham.goyal on 2/18/17.
 */
public class NumberComponent476 {

    public  static int findComplement(int num) {
        int i = 1;
        int multiplier = 2;
        int temp = num;
        temp = temp >> 1;
        while(temp != 0){
            temp = temp >> 1;
            i += multiplier;
            multiplier *= 2;
        }

        return num ^ i;

    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
