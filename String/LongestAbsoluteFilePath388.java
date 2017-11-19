package String;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by shubham.goyal on 2/5/17.
 */
public class LongestAbsoluteFilePath388 {



    public static int lengthLongestPath(String input) {
        int longest = 0;
        String[] lines = input.split("\n");
        int[] lens = new int[lines.length+1];
        for(String line: lines) {
            String[] subs = line.split("\t");
            String cur = subs[subs.length-1];
            int len = lens[subs.length-1] + cur.length() + 1;
            if(cur.contains(".")) longest = Math.max(longest, len-1);
            else lens[subs.length] = len;
        }
        return longest;
    }


    public static int lengthLongestPathWithSpace(String input) {
        int longest = 0;
        String[] lines = input.split("\n");
        int[] lens = new int[lines.length+1];
        for(String line: lines) {

            int level =  line.lastIndexOf(' ') + 1;
            int len = lens[level] + line.length() - level + 1;
            if(line.contains(".")) longest = Math.max(longest, len-1);
            else lens[level + 1] = len;
        }
        return longest;
    }


    public static void main(String[] args) {
        System.out.println(lengthLongestPath("dir\n\taaaaaaaaaaaaaaaaaaaaa\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
        System.out.println(lengthLongestPathWithSpace("dir\n aaaaaaaaaaaaaaaaaaaaa\n  file1.ext\n  subsubdir1\n subdir2\n  subsubdir2\n   file2.ext"));
//        System.out.println(lengthLongestPath("dir\n\taaaaaaaaaaaaaaaaaaaaa\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));


    }
}
