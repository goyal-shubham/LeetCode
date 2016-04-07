import java.util.TreeMap;

/**
 * Created by shubhamgoyal on 4/5/16.
 */
public class RomanToInteger13 {


    //MySolution
    public int romanToInt1(String s) {
        TreeMap<Character, Integer> myMap = new TreeMap<>();
        myMap.put('I', 1 );
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);

        int result = 0;
        int previous = myMap.get(s.charAt(0));
        int size = s.length();
        int current = 0;
        for(int i = 1 ; i < size; i++)
        {
            current = myMap.get(s.charAt(i));
            if(current > previous)
            {
                result -= previous;
            }
            else
            {
                result += previous;
            }
            previous = current;

        }
        result += previous;
        return result;
    }

//Modified solution
    public int romanToInt(String s) {
        TreeMap<Character, Integer> myMap = new TreeMap<>();
        myMap.put('I', 1 );
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);

        char[] c1 = s.toCharArray();
        int result = myMap.get(c1[c1.length - 1]);
        for(int i = 0 ; i < c1.length - 1; i++)
        {
            if(myMap.get(c1[i]) < myMap.get(c1[i + 1]))
            {
                result -= myMap.get(c1[i]);
            }
            else
            {
                result += myMap.get(c1[i]);
            }
        }

        return result;
    }

}
