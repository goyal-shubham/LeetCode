package Sorting;

/**
 * Created by shubham.goyal on 2/23/17.
 */
public class Veritas {

    public String rollingString(String s, String[] operations) {

        StringBuilder sb = new StringBuilder(s);
        for(String input : operations) {

            String[] data = input.split(" ");
            int start = Integer.parseInt(data[0]);
            int end = Integer.parseInt(data[1]);
            if(data[2].equals("R")) {
                for(int i = start; i <= end; i++){
                    sb.setCharAt(i ,sb.charAt(i) != 'z' ? (char) (sb.charAt(i) + 1) : 'a' );
                }
            }
            else {
                for(int i = start; i <= end; i++){
                    sb.setCharAt(i ,sb.charAt(i) != 'a' ? (char) (sb.charAt(i) - 1) : 'z' );
                }
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Veritas obj = new Veritas();
        String s = "Shubhamz";
        String[] operations = new String[]{"1 1 L", "2 4 R", "3 5 L"};
        obj.rollingString(s, operations);
    }
}
