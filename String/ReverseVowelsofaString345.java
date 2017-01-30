package String;

/**
 * Created by shubham.goyal on 1/24/17.
 */
public class ReverseVowelsofaString345 {

    public static String reverseVowels(String s) {

        char[] data = s.toCharArray();
        int start = 0;
        int end = data.length - 1;

        String vowels = "aeiouAEIOU";

        while(start < end) {

            if(!vowels.contains(data[start] + "")) {
                start++;
                continue;
            }

            if(!vowels.contains(data[end] + "")) {
                end--;
                continue;
            }

            char temp = data[start];
            data[start] = data[end];
            data[end] = temp;

            start++;
            end--;
        }


        return new String(data);

    }


    public static void main(String[] args) {
        System.out.println(reverseVowels("SHUBHAM"));
        System.out.println(reverseVowels("LEETCODE"));
    }
}
