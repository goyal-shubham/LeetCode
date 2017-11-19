package String;

/**
 * Created by shubham.goyal on 2/14/17.
 */
public class MaximumAdjacentSum {

    public static int findMaxAdjacentSum(int input) {

        int multipier1 = 1;
        if(input < 0) {
            multipier1 = -1;
            input *= -1;
        }
        int prefix = input / 10;
        int suffix = 0;
        int digit1 = input % 10;
        int max = Integer.MIN_VALUE;
        int digit2;
        int currentTotal;

        if(prefix == 0) {
            return digit1;
        }

        while(prefix != 0) {

            digit2 = prefix % 10;
            int average = (int) Math.round((digit1 + digit2 )/ 2.0);
            prefix = prefix / 10;
            currentTotal = prefix * multipier1 * 10 + (average) * multipier1 + suffix;

            if(currentTotal > max) {
                max = currentTotal;
            }

            suffix += digit1 * multipier1;
            digit1 = digit2;
            multipier1 *= 10;
        }

        return max;
    }

    public static int adjacentMaxSum(int input) {

        int max =  Integer.MIN_VALUE;
        String data = String.valueOf(input);
        if(data.length() == 1) {
            return input;
        }
        long temp;
        for(int i = 0; i < data.length() - 1; i++) {

            temp = data.charAt(i) - 48;
            temp += data.charAt(i + 1) - 48;
            temp =  (temp + 1)/ 2;
            String temp1  = data.substring(0,i) + temp + data.substring(i + 2);
            max = Math.max(max, Integer.valueOf(temp1));
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(adjacentMaxSum(06));
        System.out.println(adjacentMaxSum(999));
        System.out.println(adjacentMaxSum(1919191));
        System.out.println(adjacentMaxSum(-60000006));
        System.out.println(adjacentMaxSum(1239437));
        System.out.println(adjacentMaxSum(00));
        System.out.println(adjacentMaxSum((int)Math.pow(2.0,32.0)));


        System.out.println(findMaxAdjacentSum(06));
        System.out.println(findMaxAdjacentSum(999));
        System.out.println(findMaxAdjacentSum(1919191));
        System.out.println(findMaxAdjacentSum(-60000006));
        System.out.println(findMaxAdjacentSum(-1239437));
        System.out.println(findMaxAdjacentSum(00));
        System.out.println(findMaxAdjacentSum((int)Math.pow(2.0,32.0)));


    }
}
