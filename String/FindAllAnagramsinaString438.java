package String;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by shubham.goyal on 1/26/17.
 */
public class FindAllAnagramsinaString438 {

    public boolean compareArrays(int[] patternArray, int[] sourceArray) {

        for(int j = 0; j < patternArray.length; j++) {

//            if(patternArray[p.charAt(j)] != sourceArray[p.charAt(j)]) {
//                break;
//            }
        }

        return false;

    }
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new LinkedList<>();

        if(s == null || p == null || s.length() == 0 || p.length() == 0) {
            return result;
        }


        int[] patternArray = new int[256];
        int[] sourceArray = new int[256];

        for(int i = 0; i < p.length(); i++) {
            patternArray[p.charAt(i)]++;
        }

        for(int i = 0; i < p.length(); i++) {
            sourceArray[s.charAt(i)]++;
        }

        for(int i = 0; i < s.length() - p.length() + 1; i++) {



        }

        return result;
    }
}
