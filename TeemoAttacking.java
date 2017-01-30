import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shubham.goyal on 1/28/17.
 */

public class TeemoAttacking {

    public int[] findMode(TreeNode root) {

        HashMap<Integer, Integer> myMap = new HashMap<>();
        findMode(root, myMap);
        int[] result = new int[myMap.size()];
        int count = 0;
        int max = 0;
        while(true) {
            int maxValueInMap = Collections.max(myMap.values());
            if(maxValueInMap > max) {
                for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {  // Itrate through hashmap
                    if (entry.getValue()==maxValueInMap) {
                        System.out.println(entry.getKey());
                        result[count] = entry.getKey();     // Print the key with max value
                        myMap.remove(entry.getKey());
                        break;
                    }

                }
            }
            else {
                break;
            }

        }
        int[] newArray = Arrays.copyOfRange(result, 0,  count);
        return newArray;

    }

    public void findMode(TreeNode root, HashMap<Integer,Integer> myMap) {

        myMap.put(1,4);
        myMap.put(2,3);
        myMap.put(3,5);
        return;
//        if(root == null) {
//            return;
//        }
//        if(myMap.containsKey(root.val)) {
//            myMap.put(root.val , myMap.get(root.val)+1);
//        }
//        else {
//            myMap.put(root.val, 1);
//        }
//        findMode(root.left, myMap);
//        findMode(root.right, myMap);

    }
    public static void main(String[] args) {

    }
}



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
