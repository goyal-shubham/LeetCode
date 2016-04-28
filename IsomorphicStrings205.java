import java.util.HashMap;
import java.util.Map;

/**
 * Created by shubhamgoyal on 4/21/16.
 */
public class IsomorphicStrings205 {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }
        Map myMap = new HashMap();
        Map myMap1 = new HashMap();

        for(int i = 0; i < s.length(); i++)
        {
            if(myMap.put(s.charAt(i), i) != myMap1.put(t.charAt(i), i))
            {
                return false;
            }
        }
        return true;

    }
}
