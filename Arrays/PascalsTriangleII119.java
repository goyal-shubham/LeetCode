package Arrays;

import java.util.*;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class PascalsTriangleII119 {

    public List<Integer> getRow(int rowIndex) {

        rowIndex++;
        List<Integer> result = new LinkedList<>();
        if(rowIndex == 0) {
            return result;
        }

        result.add(1);
        for(int i = 1; i < rowIndex ; i++) {

            int digit1 = 1;
            int digit2 = 0;
            for(int j = 1; j < i + 1; j++) {
                if(j == i ){
                    digit2 = 0;
                }
                else {
                    digit2 = result.remove(j);
                }
                result.add(j, digit1 + digit2);
                digit1 = digit2;
            }
        }

        return result;
    }
}
