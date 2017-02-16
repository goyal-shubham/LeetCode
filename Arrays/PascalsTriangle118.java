package Arrays;
import java.util.*;
/**
 * Created by shubham.goyal on 2/15/17.
 */
public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new LinkedList<>();
        if(numRows == 0){
            return result;
        }

        for(int i = 0; i < numRows; i++) {

            List<Integer> currentList = new LinkedList<Integer>();
            currentList.add(1);
            for(int j = 1; j < i + 1; j++) {
                if(j == i) {
                    currentList.add(1);
                }
                else {
                    int number = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    currentList.add(number);
                }
            }
            result.add(currentList);

        }
        return result;
    }
}
