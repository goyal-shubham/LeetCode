package MixSolutions;

import java.util.TreeMap;

/**
 * Created by shubhamgoyal on 3/30/16.
 * Given an integer, convert it to a roman numeral.

 Input is guaranteed to be within the range from 1 to 3999.
 */
public class IntToRoman12 {

    public String intToRoman(int num)
    {

        TreeMap< Integer, String> myMap = new TreeMap<>();
        myMap.put(1, "I" );
        myMap.put(4, "IV");
        myMap.put(5, "V");
        myMap.put(9, "IX");
        myMap.put(10, "X");
        myMap.put(40, "XL");

        myMap.put(50, "L");
        myMap.put(90, "XC");

        myMap.put(100, "C");
        myMap.put(400, "CD");

        myMap.put(500, "D");
        myMap.put(900, "CM");

        myMap.put(1000, "M");

        int l = myMap.floorKey(num);
        if(num == l)
        {
            return myMap.get(num);
        }

        return myMap.get(l) + intToRoman(num - l);
    }
}
