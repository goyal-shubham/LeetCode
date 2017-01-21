package String;

/**
 * Created by shubham.goyal on 1/17/17.
 */
public class IsomorphicStrings205 {

    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] m = new int[256];
        int[] n = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (m[s.charAt(i)] != n[t.charAt(i)]) {
                return false;
            }
            m[s.charAt(i)] = i + 1;
            n[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {

        IsomorphicStrings205 obj = new IsomorphicStrings205();
        System.out.println(obj.isIsomorphic("xyzc", "abcc"));
    }
}
